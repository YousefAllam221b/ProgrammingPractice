public class student {
	String fname;
	String lname;
	int sec;
	subject[] subjects;
    public student(String fname , String lname, int sec, subject[] subjects){
    	this.fname=fname;
    	this.lname=lname;
    	this.sec=sec;
    	this.subjects=new subject[subjects.length];
    	for(int i =0; i<subjects.length;i++){
    		this.subjects[i]= new subject(subjects[i].name,subjects[i].score);
    	}
    }

    public void change(double newscore, String name){
    	for(int i =0; i<this.subjects.length;i++){
    		if(subjects[i].name==name)
    			subjects[i].score= newscore;
    }
    }
    public double search(String sub){
    	for(int i =0; i<subjects.length;i++)
    		if(subjects[i].name==sub)
    			return subjects[i].score;
    	return -1;

    }
    public double gpa(){
    	double out=0.0;
    	for(int i =0; i<subjects.length;i++){
    		out+=subjects[i].score;
   		 }
   		 return out;
    }
    public double high(){
    	double max=subjects[0].score;
    	for(int i =1; i<subjects.length;i++){
    		if(max<subjects[i].score)
    			max=subjects[i].score;
    }
   		return max;
    }
    public double low(){
    	double min=subjects[0].score;
    	for(int i =1; i<subjects.length;i++){
    		if(min>subjects[i].score)
    			min=subjects[i].score;
    }
    return min;


}
    public String toString(){
    	String out= fname +" "+ lname +" "+ sec +" ";
    	for(int i =0; i<subjects.length;i++){
    		out+= subjects[i].name + " " + subjects[i].score + " ,";
    	}
    	return out;
    }
    public static void main(String[] args){
    	subject math=new subject("Math",120);
    	subject cs=new subject("CS",100);
    	subject dld=new subject("DLD",80);

    	subject[] subjects= new subject[] {math,cs,dld};
    	student one= new student("Yousef" , "Allam", 30, subjects);
		System.out.println(one.gpa());
    	}



}


