public class Complex {
	double real;
	double img;
    public Complex(double r,double i){
    	real=r;
    	img=i;
    }
    public String display(){
    	return real+ " + "+img +"i";
    }
    public static Complex add(Complex a,Complex b){
    	return new Complex(a.real+b.real , a.img+b.img);
    }
    public Complex add(Complex a){
    	return new Complex(a.real+real , a.img+img);
    }


}