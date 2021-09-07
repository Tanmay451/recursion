public class Exponent{
	
	static int exponent(int n){
		if (n == 0)
			return 1;
	
		int exponentOfOneLess = exponent(n-1);
		int current = 2*exponentOfOneLess;

		return current;
	}

	public static void main(String[] args){
		int n = 4;
		System.out.println("Exponent of "+n+" is "+exponent(n));
	}
}
