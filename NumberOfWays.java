public class NumberOfWays{
	
	static int numberOfWays(int n){
		if (n < 0)
			return 0;
		if (n == 0 || n == 1)
			return 1;
		return numberOfWays(n-1)+numberOfWays(n-2)+numberOfWays(n-3);
	}

	public static void main(String[] args){
		int n = 4;
		System.out.println("Number of ways to reach "+n+"th star is "+numberOfWays(n));
	}
}
