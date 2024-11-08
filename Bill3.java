// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		String name0 = args[0];
		String name1 = args[1];
        String name2 = args[2];
		int bills = Integer.parseInt(args[3]);

	    
		double res = Math.ceil(bills / 3.0);
		System.out.println("Dear " + name2 + ", " + name1 + ", and " + name0 + 
		                          ": pay " + res + " Shekels each.");  
	}
}
