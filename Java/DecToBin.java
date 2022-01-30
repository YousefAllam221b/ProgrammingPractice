public class DecToBin{
	public static String binary(int num){
		if (num==0)
			return "";
		else if (num%2 == 0)
				return  "" + binary(num/2) + 0 ;
		else
				return  "" + binary(num/2) +1;


		}

	public static void main(String[] args){
		System.out.print(binary(2567));
	}
}