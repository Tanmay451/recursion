public class Counting{

	static void printInAscendingOrder(int n){
		if (n == 0){
			return;
		}
		printInAscendingOrder(n-1);
		System.out.println(n);
	}

	static void printInDescendingOrder(int n){
		if (n == 0){
			return;
		}
		System.out.println(n);
		printInDescendingOrder(n-1);
	}

	public static void main(String[] argv){
		int n = 10;
		System.out.println("Counting in ascending order:");
		printInAscendingOrder(n);
		System.out.println("Counting in descending Order:");
		printInDescendingOrder(n);
	}
}
