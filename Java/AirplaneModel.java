public class AirplaneModel{
	String name;
	double weight;
	int seats;
	double cons;
		public AirplaneModel(){
		this.name="";
		this.weight=0.0;
		this.seats=0;
		this.cons=0.0;
	}
	public AirplaneModel(String name, int seats){
		this.name=name;
		this.weight=0.0;
		this.seats=seats;
		this.cons=0.0;
	}

	public AirplaneModel(String name, double weight,int seats,double cons){
		this.name=name;
		this.weight=weight;
		this.seats=seats;
		this.cons=cons;
	}
	public static String getName(){
		return name;
	}
	public static double getEmptyWeight(){
		return weight;
	}
	public static int getSeats(){
		return seats;
	}
	public static double getFuelConsumption(){
		return cons;
	}
	public void AddSeats(int x){
		seats+=x;
	}
	public static String display(){
		return this.name+ " " +this.weight + " " + this.seats+" "+this.cons;
	}
	public static void display(AirplaneModel a){
		System.out.print(a.name+ " " +a.weight + " " + a.seats+" "+a.cons);
	}
	public int compare(AirplaneModel a){
		return this.seats-a.seats;
	}

	public static int compare(AirplaneModel a, AirplaneModel b){
		return a.seats-b.seats;
	}
	public static void main(String[] args){
	}



















}