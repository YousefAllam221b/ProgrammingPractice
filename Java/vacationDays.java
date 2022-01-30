public class vacationDays{
	Date[] dateList;
	int numentries=0;
	public vacationDays(Date[] d){
		this.dateList=new Date[d.length];
		for(int i=0;i<d.length && d[i] != null;i++){
			dateList[i]=new Date(d[i].day,d[i].month,d[i].year);
			numentries++;
		}

	}
	public boolean inOrder(){
		boolean flag=true;
		for(int i=0;i+1<dateList.length && dateList[i]!= null && dateList[i+1]!=null;i++){
			if(dateList[i].year>dateList[i+1].year){
				flag=false;
				break;
			}
			else if(dateList[i].month>dateList[i+1].month){
				flag=false;
				break;
			}
			else if(dateList[i].day>dateList[i+1].day){
				flag=false;
				break;
			}
		}

		return flag;
	}
	public String toString(){
		String out="You have vacation days in: \n";
		for(int i=0;i<numentries;i++){
			out+="day " + dateList[i].day + " in month " + dateList[i].month +" in year " + dateList[i].year + "\n";
		}
		return out;
	}
	public static void main(String[] args){
		Date[] dates= new Date[10];
		dates[0] = new Date(11,5,2016);
		dates[1] = new Date(14,7,2016);
		dates[2] = new Date(20,9,2016);
		vacationDays vacation= new vacationDays(dates);
		System.out.println(vacation.inOrder());
		System.out.print(vacation.toString());
		vacation.dateList[0].updateDate();
		System.out.print(vacation.toString());

	}

}










