public class Counting{

	static void printInAscendingOrder(int n){
		if (n == 0){
			return;
		}
		printInAscendingOrder(n-1);
		System.out.print(n+" ");
	}

	static void printInDescendingOrder(int n){
		if (n == 0){
			return;
		}
		System.out.print(n+" ");
		printInDescendingOrder(n-1);
	}

	public static void main(String[] argv){
		int n = 10;
		System.out.println("Counting in ascending order:");
		printInAscendingOrder(n);
		System.out.println("");
		System.out.println("\nCounting in descending Order:");
		printInDescendingOrder(n);
		System.out.println("");
	}
}
