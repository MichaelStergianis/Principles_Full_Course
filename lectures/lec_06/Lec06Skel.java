import java.util.Scanner;

public class Lec06Skel {
	public static void printArr(int[] arr, int n) {
		for (int i=0; i<n; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}

	public static void method1() {
		System.out.println("*** Not using exceptions ***");

		int[] arr = new int[10];
		int i = 0;

		Scanner scan = new Scanner(System.in);
	    System.out.print ("Enter integers that you want to store (-1 to exit):\n");
		do {
	    	int num = Integer.parseInt(scan.nextLine());
	    	if (num == -1) {
	    		break;
	    	}
	    	arr[i++] = num;
		} while (true);

		System.out.println("Number of entries = " + i);
		printArr(arr, i);
	}

	public static void method2() {
		System.out.println("*** Using exceptions ***");

		int[] arr = new int[10];
		int i = 0;
		Scanner scan = new Scanner(System.in);

		do {
			int num = 0;
			try{
				num = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e){
				System.out.println(e);
				continue;
			}
			if (num == -1) {
	   		break;
	   	}
			try{
				arr[i++] = num;
			}catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Array went out of bounds");
				--i;
				break;
			}
		} while (true);
		 
		System.out.println("Number of entries = " + i);
		printArr(arr, i);
		
		// *** TO DO ***
		//
		// Add code that will allow us to handle two kinds of
		// error without crashing the program.
		// 
		// 1. If the user enters a non-number, the program should 
		//    output an appropriate message and continue getting more 
		//    numbers.  The non-number, of course, should not be added
		//    to the array storage.
		// 2. If the user enters more numbers than the length of the 
		//    array, the program prints and appropriate message and
		//    stop accepting any more numbers, printing the total 
		//    entries and the contents of the array as shown in method1()
		//    above.
		//
		//    The two exceptions classes that you need to use here are
		//	  - NumberFormatException 
		//    - ArrayIndexOutOfBoundsException
		//
		// Upload the file to blackboard before the end of the lecture. 

	}

	public static void main(String[] args) {
		// method1();
		method2();
	}

}
