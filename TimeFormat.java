// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.

		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
        String res = "";
		if (hours>12) 
		{
		res = res + (hours -12);
		}
		else
		{
			res = res + hours;
			
		}
		res= res + ":" ;
		if (minutes<10) 
		{
			res = res + "0";
		}
		res = res + minutes;
		if (hours>12) 
		{
			System.out.println(res + " PM");
			
		}
		else
		{
			System.out.println(res + " AM");
		}
	}
}