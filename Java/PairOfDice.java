import java.util.Random;
public class PairOfDice{
	int dice1;
	int dice2;
	public void roll(){
		Random r = new Random();
		dice1 = r.nextInt(6) + 1;
		dice2 = r.nextInt(6) + 1;
	}
	public PairOfDice(){
		roll();
	}
	public int getFirstDice(){
		return dice1;
	}
	public int getSecondDice(){
		return dice2;
	}
	public int getTotal(){
		return dice1 + dice2;
	}

	public static void main(String[] args){
		PairOfDice f = new PairOfDice();
		int c =0;
		do{
			f.roll();
			c++;
		} while (f.getTotal() !=2);
		System.out.println(c);
	}
}