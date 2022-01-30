public class Apartment{
	int num;
	int beds;
	int baths;
	int floor;
	int rent;
	public Apartment(int num, int beds,int baths , int floor , int rent){
		this.num=num;
		this.beds=beds;
		this.baths=baths;
		this.floor=floor;
		this.rent=rent;
	}
	public String toString(){
		return "Apartment number: "+this.num
			+" Number of bedrooms: "+this.beds
				+" Number of bathrooms: "+this.baths
				+" Floor number: "+this.floor
					+" Rent amount: "+this.rent;
	}
	public static void main(String[] args){
		Apartment apa1=new Apartment(42,3,2,4,5000);
		System.out.print(apa1.toString());
	}
}









