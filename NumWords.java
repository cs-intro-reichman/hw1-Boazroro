// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		 int wholenumber = Integer.parseInt(args[0]);
		 int hundreds = (wholenumber / 100) % 10; 
		 int tens = (wholenumber / 10) % 10;       
		 int ones = wholenumber % 10;      
		 if (wholenumber>=1000) 
		 {
			int higherhundreds =  wholenumber / 100 ;
			 System.out.println( higherhundreds + hundreds + hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


		 } 
		 
		 else
		 
		 {       
		 
		 System.out.println( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		 }

		}
}
