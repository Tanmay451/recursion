import java.util.*;

public class Subset {

	static int count = 0;

	static void subset(ArrayList<Integer> output, ArrayList<Integer> input, int idx) {

		if (idx >= input.size()) {
			System.out.println(output);
			count += 1;
			return;
		}

		subset(new ArrayList<>(output), input, idx + 1);
		output.add(input.get(idx));
		subset(new ArrayList<>(output), input, idx + 1);
	}

	public static void main(String[] argv) {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> output = new ArrayList<Integer>();
		System.out.println("Subset of " + input);
		subset(output, input, 0);
		System.out.println("Count of " + count);
	}
}
