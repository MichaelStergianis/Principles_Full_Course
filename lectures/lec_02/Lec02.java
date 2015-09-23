import java.util.Scanner;

class Lec02
{
	public static void main(String[] args){
		if (args[0].contentEquals("Greet")){
			Scanner scan = new Scanner(System.in);
			System.out.print("Hello, what is your name? ");
			String name = scan.next();
			System.out.println("Hello " + name + ". How may I help you?");
		} else{
			System.out.println("Hello World!");
		}
	}
}
