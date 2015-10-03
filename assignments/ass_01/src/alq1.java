import java.io.*;
import java.util.Scanner;

class Username
{
	private static String fname;
	private static String lname;
	private static char[] uname;
	private int uint;
	private static DataB db = null;

	// This increments the char, but handles the case that 9 does not by
	// default increment to 0, so it recursively increments needed char(s)
	private static char[] incrementChar(char[] curr, int i){
		if ((curr[curr.length - i]) < '9'){
			(curr[curr.length - i])++;
			return curr;
		}
		else{
			curr[curr.length - i] = '0';
			return incrementChar(curr, i+1);
		}
	}

	// this was a pain in the ass to make, but it works for any length of name
	private static void createUname(){
		uname = new char[9];
		char[] temp = new char[9];
		temp[0] = fname.charAt(0);
		// if the last name is more than 5 chars we use our standard 0 pad
		if (lname.length() >= 5){
			for (int i = 0; i < 5; ++i)
				temp[i+1] = lname.charAt(i);
			for (int i = 0; i < 6; ++i)
				temp[i] = Character.toLowerCase(temp[i]);
			String temp_uname = new String(temp);
			// is the temp uname already in use? if so, how many times?
			temp_uname = db.compareUname(temp_uname, 6);
			if (temp_uname != null){
				// if it is, change uname to be our most up to date uname
				// that is similar, then, increment the number it uses
				for (int i = 0; i < temp_uname.length(); ++i)
					uname[i] = temp_uname.charAt(i);
				uname = incrementChar(uname, 1);
			} else {
				// if not, zeroes are fine
				for (int i = 6; i < 9; ++i){
					temp[i] = '0';
				}
				for (int i = 0; i < temp.length; ++i){
					uname[i] = temp[i];
				}
			}
		// if the last name is less than 5 characters, we pad more
		} else{
			int lname_len = lname.length();
			for (int i = 0; i < lname_len; ++i)
				temp[i+1] = lname.charAt(i);
			for (int i = 0; i < 6; ++i)
				temp[i] = Character.toLowerCase(temp[i]);
			String temp_uname = new String(temp);
			temp_uname = db.compareUname(temp_uname, (lname_len + 1));
			if (temp_uname != null){
				uname = temp_uname.toCharArray();
				uname = incrementChar(uname, 1);
			} else {
				for (int i = (lname_len+1); i < 9; ++i){
					temp[i] = '0';
				}
				for (int i = 0; i < temp.length; ++i){
					uname[i] = temp[i];
				}
			}
		}
	}

	public static void getUname(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input the user's first name: ");
		fname = s.next();
		System.out.print("Input the user's last name: ");
		lname = s.next();
	}
	public static boolean confirmUname(){
		getUname();
		createUname();
		System.out.print("Your username is:  ");
		System.out.println(uname);
		System.out.println("Your firstname is: " + fname);
		System.out.println("Your lastname is:  " + lname);
		String conf = getConf();
		while ( !( conf.equals("y") || conf.equals("n"))){
			conf = getConf();
		}
		if (conf.equals("y")){
			return true;
		} else {
			return confirmUname();
		}
	}
	public static String getConf(){
		Scanner s = new Scanner(System.in);
		System.out.println("Is this acceptalble (y/n)? ");
		String conf = s.next();
		conf.toLowerCase();
		return conf;
	}

	public static void main(String[] args){
		db = new DataB();
		db.load("username.db");
		db.read();
		// db.printLines();
		confirmUname();
		db.incrementElem();
		db.writeFile(fname, lname, uname);
		// System.out.println(uname);
	}
}

class DataB
{
	private int num_elem;
	private String[] lines;
	private File db = null;
	private Scanner s;
	private FileReader in = null;

	public void load(String arg){
		db = new File(arg);
		if (!db.isFile()){
			System.out.println(arg + " does not exist. creating.");
			try{
				db.createNewFile();
				db.setWritable(true);
			} catch (IOException e){
				e.printStackTrace();
			}
		} else{
			System.out.println(arg + " found.");
		}
	}

	public void read(){
		try{
			s = new Scanner(db);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		// read the first line, the number of elements
		if (s.hasNextInt()){
			num_elem = s.nextInt();
			lines = new String[num_elem * 3];
			for (int i = 0; i < (num_elem * 3); ++i){
				lines[i] = s.next();
			}
		} else{
			num_elem = 0;
			lines = new String[0];
			System.out.println("First element was not interpreted as int");
		}
	}

	public void writeFile(String fname, String lname, char[] uname){
		FileWriter fw;
		String elem_string = Integer.toString(num_elem);
		try{
			fw = new FileWriter(db, false);
			fw.write(elem_string, 0, elem_string.length());
			fw.write("\n");
			for (int i = 0; i < lines.length; ++i){
				fw.write(lines[i]);
				fw.write("\n");
				if ( i % 10 == 0){
					fw.flush();
				}
			}
			fw.write(fname);
			fw.write("\n");
			fw.write(lname);
			fw.write("\n");
			fw.write(uname);
			fw.write("\n");
			fw.flush();
			fw.close();
		} catch (IOException e){
			System.out.println(e);
		}
	}

	public void incrementElem(){
		num_elem++;
	}

	public String compareUname(String uname, int length){
		String temp = null;
		String sub = null;
		for (int i = 0; i < num_elem; ++i){
			sub = lines[i*3+2].substring(0, length);
			if ( uname.contains(sub) )
				temp = lines[(i * 3)+2];
		}
		return temp;
	}

	public void printLines(){
		for (int i = 0; i < lines.length; ++i)
			System.out.println(lines[i]);
	}
}
