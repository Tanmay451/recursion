public class Fibonacci{
	static int fibonacci(int n){
		if (n == 0 || n == 1)
			return n;
		int f1 = fibonacci(n-1);
		int f2 = fibonacci(n-2);
		return f1+f2;
	}

	public static void main(String[] args){
		int n = 4;
		System.out.println("Fibonacci of "+n+" is "+fibonacci(n));
	}

}
