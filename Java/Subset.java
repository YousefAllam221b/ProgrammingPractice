public class Subset{
	public static String checker(int[] a , int[] b){
		String flag = "false";
		String x = "true";
		for(int i =0; i<a.length;i++){
			if (member(a[i],b).equals("false"))
				return "false";

		}
		return "true";
	}
	public static String member(int n , int[] m){
		for ( int i =0;i<m.length;i++){
			if (n == m[i])
				return "true";
		}
		return "false";
	}

	public static void main(String[] args){
		int[] y = {1,2,3};
		int[] z = {2,4,5,1};
		System.out.print(checker(y,z));
	}
}













