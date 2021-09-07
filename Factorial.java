public class Factorial{
	static int factorial(int n){
		if (n <=1)
			return 1;
		
		int nextValueFactorial = factorial(n-1);
		return n*nextValueFactorial;
	}

	public static void main(String[] args){
		int n = 4;
		System.out.println("Factorial of "+n+" is "+factorial(n));
	}
}
