import java.text.DecimalFormat;
import java.util.Random;


public class Student{

	private String name;
	private String address;
	private String major;
	private double GPA;
	private static Random rand = new Random();
	private static DecimalFormat fmt = new DecimalFormat("0.###");
	
	public Student(String newName, String newAddress, String newMajor)
	{
		name = newName;
		address = newAddress;
		major = newMajor;
		computGPA();
	}
	
	public Student(String newName, String newAddress)
	{
		name = newName;
		address = newAddress;
		major = "Undeclard";
		computGPA();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public void computGPA()
	{
		GPA = 0.5 + (rand.nextDouble()*3.5);
	}
	
	public String toString()
	{
		String result = "";
		result += ("Name:" + name + "\n");
		result += ("Address: " + address + "\n");
		result += ("Major: " + major + "\n");
		result += ("GPA: " + fmt.format(GPA) + "\n");
		return result;
	}
	public int compareTo(Student s2){
		if (this.name.compareTo(s2.getName()) > 0)
			return 1;
		else if (this.name.compareTo(s2.getName()) < 0)
			return -1;
		if (this.address.compareTo(s2.getAddress()) > 0)
			return 2;
		else if (this.address.compareTo(s2.getAddress()) < 0)
			return -2;
		if (this.major.compareTo(s2.getMajor()) > 0)
			return 3;
		else if (this.major.compareTo(s2.getMajor()) < 0)
			return -3;
		if (this.GPA > s2.getGPA())
			return 4;
		else if (this.GPA < s2.getGPA())
			return -4;
		return 0;
	}
}
