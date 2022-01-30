public class countedReverse{
	public static String reverse(String s){
		String result ="";
		for(int i =0; i < s.length();i++){
			result = s.charAt(i) + result;
		}
		return result;
	}
	public static String counted(String s , int n){
		int c=1;
		String before="";
		String after ="";
		for (int i =0; i<s.length();i++){
			before+=s.charAt(i);
			if (c==n){
				after += reverse(before);
				System.out.println(after);
				before="";
				c=0;
			}
			c++;
		}
		return after + before;
	}
	public static void main(String[] args){
		System.out.println(counted("123456",3));

	}
}