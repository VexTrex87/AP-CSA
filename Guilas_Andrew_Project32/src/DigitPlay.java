// ******************************************************************* 
//   DigitPlay.java 
//  
//   Finds the number of digits in a positive integer. 
// ******************************************************************* 
import java.util.Scanner; 
public class DigitPlay 
{ 
	public static void main (String[] args) 
	{ 
		int num;   
		//a number 
		Scanner scan = new Scanner(System.in); 
		System.out.println();
		System.out.print 
		("Please enter your identification number: "); 
		num = scan.nextInt (); 
		if (num <= 0) 
			System.out.println( num + " isn't a valid number -- start over!!"); 
		else {
			// Call numDigits to find the number of digits in the number 
			// Print the number returned from numDigits 
			System.out.println ("\nThe number " + num + " contains " + + numDigits(num) + " digits."); 
			System.out.println ("\nThe numbers in " + num + " add up to " + + sumDigits(num) + "."); 
			} 
		if ((sumDigits(num)%7) != 0)
		{
			System.out.println("\nerror"); 
		}
		else
			System.out.println("\nok");
		} 
	// ----------------------------------------------------------- 
	//  Recursively counts the digits in a positive integer  
	// ----------------------------------------------------------- 
	public static int numDigits(int num) 
	{ 
		if (num < 10) 
			return (1);
		else return (1 + numDigits(num/10)); 
		} 

	public static int sumDigits(int num) 
	{ 	
		if (num < 10) 
			return num;
		else return (num % 10 + sumDigits(num/10)); 
		} 
} 