import java.util.Scanner;
import java.util.Random;

class Student
{
	public String name;
}

class Lec2
{
	public static void main(String[] args)
	{
		System.out.println( "Lec 2" );
		// System.out.print( "Lec 2" );

		// Strings are an immutable type.
		int a,b;
		a = 4;
		b = 6;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		String c;
		c = "Wolf";
		System.out.println( c );

		int i;
		for (i=0; i<4; ++i){
			System.out.println( "c at " + i + " = " + c.charAt(i));
		}
		
		Student e = new Student();
		e.name = "Alex";

		System.out.println("e's name = " + e.name);

		Student f;
		f = e;
		System.out.println("f's name = " + f.name);
		f.name = "Tom";
		System.out.println("e's name = " + e.name);
		System.out.println("f's name = " + f.name);

		Random gen = new Random();
		int num1;
		float num2;

		num1 = gen.nextInt();
		System.out.println(" A random int: " + num1);


	}
}
