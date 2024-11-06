// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    
		 int number = Integer.parseInt(args[0]);
        
		
		 int hundreds = (number / 100) % 10;  // Get the hundreds place
		 int tens = (number / 10) % 10;       // Get the tens place
		 int ones = number % 10;              // Get the ones place
		 int higherHundreds = number / 100;
		 // Print the result in the specified format
		 System.out.println( higherHundreds + hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
