public class commonElements{
	public static void helper(int[] a,int[] b , int c , int d){
		if (c == a.length || d ==b.length)
			return;
		else if (a[c]==b[d]){
			System.out.print(a[c] +" ");
			helper(a,b,++c,++d);
		}
		else if(a[c]<a[d])
			helper(a,b,++c,d);
		else
			helper(a,b,c,++d);


	}
	public static void common(int[] a ,int[] b){
		helper(a,b,0,0);
	}
	public static void main(String[] args){
		int[] list1 = {4,5,6,7,8};
		int[] list2 = {2,3,4,8,10,16};
		common(list1,list2);

	}
}







