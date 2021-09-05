public class Permutation{
	
	static String swap(String str, int i, int j){
        	StringBuilder sb = new StringBuilder(str);
        	sb.setCharAt(i, str.charAt(j));
        	sb.setCharAt(j, str.charAt(i));
        	return sb.toString();
    	}

	static void permutation(String s,int idx){
		if (idx == s.length()-1){
			System.out.println(s);
			return;
		}

		for (int i = idx;i<s.length();i++){
			s = swap(s,idx,i);
			permutation(s,idx+1);
			s = swap(s,idx,i);
		}
	}

	public static void main(String[] args){
		String s = "abcd";
		permutation(s,0);
	}
}
