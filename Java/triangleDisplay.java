public class triangleDisplay{
	public static void displayRec(int[] a){
		helper(a,0);
	}
	public static void helper(int[] a, int c){
		if (c==a.length)
			return;
		System.out.print(a[c]);
		helper(a,c+1);
	}
	public static void triangle(int n){
		int[][] r = new int[n][];
		for (int i=0; i<n;i++){
			r[i] = new int[j];
			for(int j=0; j<n;j++){
				r

				}
			}
			displayRec(r[i]);
		}
	}
	public static void main(String[] args){
		triangle(5);
	}
}












