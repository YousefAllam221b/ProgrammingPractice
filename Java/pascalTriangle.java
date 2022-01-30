public class pascalTriangle {
	public static void display(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	public static int[][] triangle(int n){
		int[][] a = new int[n][];
		for (int i =0 ; i<n;i++){
			 a[i]= new int[i+1];
			for (int j=0;j<a[i].length;j++){
				if(j==0 || j==i)
					a[i][j]=1;
				else
					a[i][j]= a[i-1][j] + a[i-1][j-1];
			}
		}
		return a;
	}


    public static void main(String[] args) {
    	display(triangle(6));
    }


}








