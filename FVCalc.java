// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futurevalue = (currentValue *((interest)/100+1));
        System.out.println("After " + years + " years" + "," + " $" +currentValue + 
		         " saved at " + interest +"% will yield " + futurevalue );
		

		

	}
}