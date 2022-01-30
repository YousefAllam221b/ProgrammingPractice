public class sumArray{
	public static void sum(int[] a, int n){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] + a[j] ==n)
					System.out.println(a[i]+"+"+a[j]+ " = " + n);
			}
		}
	}
	public static void main(String[] args){
		sum(new int[]{2, 7, 4, -5, 11, 5, 20},15);
	}
}