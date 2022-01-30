public class Hotel{
	String name;
	int roomsRented=0;
	Room[] rooms;
	public Hotel(String name,int num){
		this.name=name;
		this.rooms= new Room[num];
	}
	public double rentSum(){
		double sum = 0;
		for(int i=0;i<roomsRented;i++){

			sum+=rooms[i].rent*rooms[i].days;

		}
		return sum;
	}
	public double avgDays(){
		double avg = 0;
		int number=0;
		for(int i=0;i<roomsRented;i++){
			if (rooms[i]!=null ){

			avg+=rooms[i].days;
			number++;
			}
		}
		return avg/number;

	}
	public void printRentalList(){
		for(int i=0;i<roomsRented;i++){
			System.out.println(rooms[i].toString());
		}
	}
	public void addReservation(Room r){
		if (roomsRented<rooms.length){
			rooms[roomsRented]=r;
			roomsRented++;
		}
		else
			System.out.println("no rooms avaliable");

	}
	public void findReservation(int n){
		int x=-1;
		boolean flag=false;
		for(int i=0;i<roomsRented && !flag;i++){
				if (rooms[i].num == n){

					x=i;
					flag=true;
				}


		}
		if (flag)
			System.out.println(rooms[x].toString());
		else
			System.out.println("We didn't find this reservation");
	}
	public static void main(String[] args){
		Hotel h = new Hotel("Montage",100);
		h.addReservation(new Room("Blake",123,1,123.5,5));
		h.addReservation(new Room("Smith",222,2,144.5,4));
		h.addReservation(new Room("Joe",352,2,155,7));
		h.addReservation(new Room("Jane",333,1,140,5));
		System.out.println(h.rentSum());
		System.out.println(h.avgDays());
		h.findReservation(222);

	}









}