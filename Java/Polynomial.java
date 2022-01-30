public class Polynomial{
	double[] a;
	public Polynomial(){
		this.a= new double[0];
	}
	public Polynomial(double[] list){
		this.a= new double[list.length];
		for(int i =0;i<list.length;i++){
			a[i]=list[i];
		}
	}
	public int degree(){
		return this.a.length;
	}
	public static Polynomial add(Polynomial one , Polynomial two){
		double[] r = new double[one.a.length];
		for(int i =0; i<r.length;i++){
			r[i]= one.a[i] + two.a[i];
		}
		return new Polynomial(r);
	}
	public String toString(){
		String s = "";
		int j =this.a.length-1;
		for (int i =0; i<this.a.length;i++){
			if (i != this.a.length-1){

			s+= a[i] + "x^" +j + " ";
			j--;}
			else
				s+=a[i];
		}
		return s;
	}
	public static void main(String[] args){
		double[] x= {1,2,3,4,5};
		double[] y= {6,7,8,9,10};
		Polynomial x1 = new Polynomial(x);
		Polynomial x2 = new Polynomial(y);
		System.out.print(add(x1,x2));
	}
}










