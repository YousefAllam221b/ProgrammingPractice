public class triangle {
	point x;
	point y;
	point z;
	static int count=0;
    public triangle(){
    	x=point(0,0);
    	y=point(0,0);
    	z=point(0,0);
    	count++;
    }
    public triangle(point a, point b , point c){
    	x=a;
    	y=b;
    	z=c;
    }
    public triangle copy(){
    	return new triangle(this.x,this.y,this.z);
    }
	public void rotate(){
		point tempx=x;
		x=y;
		y=z;
		z=tempx;
	}
	public String toString(){
		return "P1= " + x + "P2= " + y + "P3= " + z ;
	}
	public static void main(String[] args){
	}

}