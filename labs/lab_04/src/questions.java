import java.util.Scanner;


public class questions {

	void q1()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String input = s.next();
		char[] char_input; 
		char_input = input.toCharArray();
		char[] rev_input = new char[char_input.length];
		for (int i = 0; i < rev_input.length; ++i){
			rev_input[ (rev_input.length - 1) - i] = char_input[i];
		}
		System.out.println(rev_input);
	}
	
	void q2()
	{
		Student s1_1 = new Student("Tom", "Oshawa", "Computer Science");
		Student s1_2 = new Student("Tom", "Oshawa", "Computer Science");
		
		Student s2_1 = new Student("Jean", "Toronto", "Chemistry");
		Student s2_2 = new Student("Jean", "Toronto");
		
		Student s3_1 = new Student("Tom", "Toronto");
		Student s3_2 = new Student("Tom", "Oshawa");
		
		Student s4_1 = new Student("Kate", "Whiteby");
		Student s4_2 = new Student("Tom", "Whiteby");
		
		/*
		System.out.println(s1_1.compareTo(s1_2));
		System.out.println(s2_1.compareTo(s2_2));
		System.out.println(s3_1.compareTo(s3_2));
		System.out.println(s4_1.compareTo(s4_2));*/
	}
}
