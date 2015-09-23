import java.util.Scanner;


class Lec1
{
	public static void main(String[] args)
	{
		String course = "\"Theory\"";
		String msg = "This course is called";
		System.out.println( course );
		char space = ' ';
		String finalMsg = msg + space + course;
		System.out.println( finalMsg );

		long ageOfUniverse;
		ageOfUniverse = 140000;
		
		long ageOfOurSun = 4500000;
		System.out.println( "The age of our universe is " + ageOfUniverse);
		System.out.println( "The age of our sun is " + ageOfOurSun);

		final double gravity = 9.87;

		int a, b, c;
		Scanner scan = new Scanner(System.in);

		System.out.println("What's your name boy? ");
		String name = scan.next();
		System.out.println("Hello " + name);
		

		a = 10;
		System.out.println( "a = " + a );
		b = ++a;
		System.out.println( "b = " + b );
		System.out.println( "a = " + a );
		
		b = (5 + 2) * 10;
		System.out.println( "b = " + b );
	}
}
