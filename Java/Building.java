public class Building{
	String name;
	Apartment[] theApartments;
	int size;
	public Building(String name, int size){
		this.name=name;
		this.size=size;
		this.theApartments=new Apartment[size];
	}
	public void addApartment(Apartment a){
		int i=0;
		boolean flag=false;
		int current=0;
		for(int k=0;k<theApartments.length;k++){
			if(theApartments[k]!=null)
				current++;
		}
		if (current ==size){
			flag =true;
			System.out.println("The building is full");
		if (flag == false){

		for(int j=0;j<theApartments.length;j++){
			if(this.theApartments[j].num==0)
				break;
			else if (theApartments[j] == a){

				System.out.println("this apartment already exist");
				flag=true;
				break;
			}
		}
		if (flag ==false){

		while (i<theApartments.length){
			if (theApartments[i].num ==0)
				break;
			i++;
		}
		this.theApartments[i]=a;
		}

		}
	}}
	public String generateFloor(int floorLevel){
		String result="";
		for(int i=0;i<theApartments.length;i++){
			if (theApartments[i].floor == floorLevel){
				result+= theApartments[i].num + " ";
			}
		}
		return result;

	}
	public String toString(){
		String info="";
		for(int i=0;i<this.size;i++){
			if(theApartments[i] != null)
			info+="Apartment number: "+theApartments[i].num
				+" Floor number: "+theApartments[i].floor;
		}
		return info;
	}
	public static void main(String[] args){
		Building first=new Building("City Lights",50);
		first.addApartment(new Apartment(8,4,3,3,4500));
		first.addApartment(new Apartment(10,3,2,4,3500));
		first.addApartment(new Apartment(6,4,3,2,4500));
		first.addApartment(new Apartment(18,5,3,6,5500));
		System.out.print(first.toString());
		String a = first.generateFloor(3);
		System.out.println("Apartments in floor:");
		System.out.print(a);




	}
}






