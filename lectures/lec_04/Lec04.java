import java.lang.Math;

class Lec04 {
	public static void main(String[] args) {
		int[] numbers = MyNumberReader.read("numbers.txt");
		
	}
}

class vec 
{
	private int a;
	private int b;
	private int c;

	public void Vec(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double computeLength(){
		double a1 = (double) a;
		double b1 = (double) b;
		double c1 = (double) c;

		double sqaredLen = a1*a1 + b1*b1 + c1*c1;
		double len = Math.sqrt(sqaredLen);

		return len;
	}
}
