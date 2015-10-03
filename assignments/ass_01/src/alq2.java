import java.util.Vector;

class Primes{
	private static long startTime;
	private static long endTime;
	private static int size;
	private static int ind;
	private static int[] primes;
	private static int candidate;
	private static boolean isPrime;
	private static int arg;

	private static void resizeArray(){
		int[] temp = new int[size+5];
		for (int i = 0; i < size; i++){
			temp[i] = primes[i];
		}
		primes = temp;
		size += 5;
	}

	public static void addElem(int elem){
		if (ind == size){
			resizeArray();
		}
		primes[ind++] = elem;
	}

	public static void main(String args[]){
		arg = Integer.parseInt(args[0]);
		startTime = System.nanoTime();
		if (arg <= 1){
			System.out.println("There are no primes that exist below 1.");
		} else if (arg == 2){
			endTime = System.nanoTime();
			System.out.println(2 + " took ("
					+ ((endTime - startTime) / 1000000.0) + "ms)");
		}else{
			addElem(2);
			for (candidate = 3; candidate <= arg; candidate = candidate + 2){
				isPrime = true;
				for (int j = 0; j < ind; ++j){
					if ( new Integer(candidate) % primes[j] == 0){
						isPrime = false;
						break;
					}
				}
				if (isPrime){
					addElem(candidate);
				}
			}
			endTime = System.nanoTime();
			for (int i = 0; i < ind; ++i){
				System.out.print(primes[i] + ", ");
			}
			System.out.println("took (" + ((endTime - startTime) / 1000000.0) + "ms)"); 
		}
	}
}
