// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("Usage: java Ascend <lim>");
            return;
        }

        // Parse the limit from the command-line argument
        int lim = Integer.parseInt(args[0]);
        
        // Generate three random integers in the range [0, lim)
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
        
        // Print the original numbers
        System.out.println(a + " " + b + " " + c);
        
        // Calculate min, max, and middle using Math.min and Math.max
        int min = Math.min(Math.min(a, b), c);  // Smallest value
        int max = Math.max(Math.max(a, b), c);  // Largest value
        int middle = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));  // The middle value

        // Print the sorted numbers in ascending order
        System.out.println(min + " " + middle + " " + max);
	}
}
