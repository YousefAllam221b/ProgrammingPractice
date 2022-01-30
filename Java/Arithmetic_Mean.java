public class Arithmetic_Mean{
	public static boolean checker(int[][] a){
		for(int i=0; i<a.length; i++){
			if(!(a[i].length ==i+1 && val(a[i],i+1)))
				return false;
		}
		return true;
	}
	public static boolean val(int[] b , int n){
		for(int i=0; i<b.length; i++){
			if(b[i] != n)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		int[][] s={{1},{2,2},{3,3,3,3},{4,4,4,4}};
		System.out.print(checker(s));
	}
}









