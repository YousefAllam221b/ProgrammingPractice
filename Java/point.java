public class point {
	double x;
	double y;
	static int count=0;
    public point(){
    	this(0,0);
    }
    public point(double x,double y){
    	this.x=x;
    	this.y=y;
    	count++;
    }
    public static point add(point p1,point p2){
    	return new point(p1.x+p2.x,p1.y+p2.y);
    }
    public void add(point p1){
    	this.x+=p1.x;
    	this.y+=p1.y;
    }
    public static void swap(point p1,point p2){
    	double tempx=p1.x;
    	double tempy=p1.y;
    	p1.x=p2.x;
    	p1.y=p2.y;
    	p2.x=tempx;
    	p2.y=tempy;
    }
    public void swap(point p1){
    	double tempx=x;
    	double tempy=y;
    	x=p1.x;
    	y=p1.y;
    	p1.x=tempx;
    	p1.y=tempy;
    }
    public String toString(){
    	return "X= " + x + ", Y= " + y;
    }
    public static void main(String[] args){

    }

}