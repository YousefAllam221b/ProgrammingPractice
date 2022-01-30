public class Room{
	int num;
	String name;
	int days;
	double rent;
	int beds;
	public Room(String name,int num,int beds,double rent,int days){
		this.num=num;
		this.name=name;
		this.days=days;
		this.rent=rent;
		this.beds=beds;
	}
	public String toString(){
		return num +" "+name +" "+ days +" "+ rent +" "+ beds;
	}

}






















