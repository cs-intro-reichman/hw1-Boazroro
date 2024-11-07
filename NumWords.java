// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		 int number = Integer.parseInt(args[0]);
		 int hundreds = (number / 100) % 10; 
		 int tens = (number / 10) % 10;       
		 int ones = number % 10;      
		 if (number>=1000) 
		 {
			int higherhundreds =  number / 100 ;
			 System.out.println( higherhundreds + hundreds + hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


		 } 
		 
		 else
		 
		 {       
		 
		 System.out.println( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		 }

		}
}
