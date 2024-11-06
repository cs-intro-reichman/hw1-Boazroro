// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1])/100;
		int years = Integer.parseInt(args[2]);
		double futurevalue = currentValue * Math.pow(interest + 1 ,years);
        System.out.println("After " + years + " years" + ", a" + " $" +currentValue + 
		         " saved at " + (100 * interest) +"% will yield " + "$" + ((int)futurevalue));
		

		

	}
}