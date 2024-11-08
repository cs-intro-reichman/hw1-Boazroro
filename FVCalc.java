// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue1 = Integer.parseInt(args[0]);
		double interest1 = Double.parseDouble(args[1])/100;
		int years = Integer.parseInt(args[2]);
		double futurevalue = currentValue1 * Math.pow(interest1 + 1 ,years);
        System.out.println("After " + years + " years" + ", a" + " $" + currentValue1 + 
		         " saved at " + (100 * interest1) +"% will yield " + "$" + ((int)futurevalue));
		

		

	}
}