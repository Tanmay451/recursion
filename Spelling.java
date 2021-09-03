public class Spelling{
	static String[] spellingOfInt = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
	
	static void spelling(int n,int l){
		if (l == 0)
			return;

		int nextVal = n/10;
		spelling(nextVal,l-1);

		int current = n%10;
		System.out.print(spellingOfInt[current]+" ");
	}

	public static void main(String[] args){
		int number = 4321;
		int len = String.valueOf(number).length();
		System.out.print("Spelling of "+number+" is: ");
		spelling(number,len);
		System.out.println("");		
	}
}
