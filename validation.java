package application;

public class validation {
	
	public static boolean isValidDecimal(String number) {
		Boolean isValid=true;
		int counter=0;
		int count=0;
		do {
			if(number.charAt(counter)=='.')
				count++;
			if(count==1)
				isValid=false;
			counter++;
		}while(counter<number.length() && (isValid));
		return isValid;
	}
	
	public static double addingValue(String number) {
		double value=Double.parseDouble(number);
		value=value*(-1);
		return value;
	}
	public static double powertotwo(String number) {
		double value=Double.parseDouble(number)*2;
		return value;
	}
	public static double sqrt_number(String number) {
		double value=Math.sqrt(Double.parseDouble(number));
		return value;
	}
}
