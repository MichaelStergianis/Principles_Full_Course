import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class MyNumberReader {
	public static int[] read(String filename) {

	List<Integer> list = new ArrayList<Integer>();
	File file = new File(filename);
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader(file));
	  String text = null;

		while ((text = reader.readLine()) != null) {
			list.add(Integer.parseInt(text));
		}
	} catch (FileNotFoundException e) {
	  e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
			try {
				if (reader != null) {
					reader.close();
        }
	    } catch (IOException e) {
		  }
	}

	//System.out.println("Numbers read from the file:");
	//System.out.println(list);
	
	int[] numbers = new int[list.size()];
		for (int i=0; i<list.size(); ++i) {
			numbers[i] = list.get(i);
		}
		return numbers;
	}

}
