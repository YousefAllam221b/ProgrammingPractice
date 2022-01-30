public class sequence{
	public static int min(int[] n){
		int i=1;
		return helper(n[0],n,i);
	}
	public static int helper(int a,int[] n,int i){
		if(i==n.length)
			return a;
		else if (n[i]<a){

			a=n[i];
			return helper(a,n,++i);
		}
		else

			return helper(a,n,++i);
	}
	public static void main(String[] args){
		int[] a={1,2,3,4};
		System.out.print(min(a));
	}
}