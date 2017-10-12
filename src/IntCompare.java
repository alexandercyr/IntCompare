import java.util.Scanner;
import java.lang.Math;

public class IntCompare {
	public static void main(String[] args) {
		Boolean evenSums = false;
		
		//Initialize scanner
		Scanner scnr = new Scanner(System.in);
		
		//Prompt input from user
		System.out.println("Enter two integers to compare: ");
		
		//Store integers into separate variables
		int value1 = scnr.nextInt();
		int value2 = scnr.nextInt();
		
		//Convert to positive number
		value1 = Math.abs(value1);
		value2 = Math.abs(value2);
		
		//Convert int to string
		String value1String = String.valueOf(value1);
		String value2String = String.valueOf(value2);

		
		//Evaluate if integers have same number of digits
		if (value1String.length() == value2String.length()) {
			
			int numDigits = value1String.length();	
			int sumInts = Character.getNumericValue(value1String.charAt(0)) + Character.getNumericValue(value2String.charAt(0));
			
			for (int i = 1; i < numDigits; ++i) {
				int nextSum = Character.getNumericValue(value1String.charAt(i)) + Character.getNumericValue(value2String.charAt(i));
				
				// Sum of digits are equal
				
				if (sumInts == nextSum) {
					sumInts = nextSum;
					evenSums = true;
				}
				// Sum of digits do not equal previous sum of digits
				
				else {
					evenSums = false;
					break;
				}
			}
			
			System.out.println(evenSums);
			
		}
		
		else {
			System.out.println("Error: Integers must have the same number of digits.");
		}
		
		
	}
}
