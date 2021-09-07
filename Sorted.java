import java.util.Arrays;

public class Sorted{
	static boolean sorted(int i, int[] array){
		if (i == array.length-1)
			return true;
		if (array[i]>array[i+1])
			return false;
		return sorted(i+1,array);
	}

	public static void main(String[] args){
		int sortedArray[] = {1,2,3,4};
		System.out.println(Arrays.toString(sortedArray)+" is sorted "+sorted(0,sortedArray));
		
		int unsortedArray[] = {1,2,4,3};
		System.out.println(Arrays.toString(unsortedArray)+" is sorted "+sorted(0,unsortedArray));
	}
}
