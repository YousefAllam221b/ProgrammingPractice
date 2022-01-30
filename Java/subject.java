public class subject {
	String name;
	double score;
    public subject(String name , double score){
    	this.name=name;
    	this.score=score;
    }
    public subject(){
    	this.name="";
    	this.score=0.0;
    }
    public String toString(){
    	return name + " " + score;
    }


}