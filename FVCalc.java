// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futurevalue = (currentValue *(((interest)/100) + 1));
		futurevalue=futurevalue*futurevalue/100;
        System.out.println("After " + years + " years" + ", a" + " $" +currentValue + 
		         " saved at " + interest +"% will yield " + "$" + ((int)futurevalue));
		

		

	}
}