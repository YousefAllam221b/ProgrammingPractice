public class Date{
	int day;
	int month;
	int year;
	static int[] monthDays = {31,28,31,30,31,31,30,31,30,31,30,31};
	public Date(int day , int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public void updateDate(){
		day=day+1;
	}
	public String toString(){
		return day +"/" + month +"/"+year;
	}
}














