// ****************************************************************** 
//   BaseConversion.java 
// 
//   Recursively converts an integer from base 10 to another base 
// ****************************************************************** 
import java.util.Scanner; 
public class BaseConversion 
{ 
	public static void main (String[] args) 
	{ 
	int base10Num; 
	int base;
	Scanner scan = new Scanner(System.in);
	System.out.println ();
	System.out.println ("Base Conversion Program"); 
	System.out.print ("Enter an integer: ");
	base10Num = scan.nextInt(); 
	System.out.print ("Enter the base: ");
	base = scan.nextInt(); 
	// Call convert and print the answer 
	System.out.print("\n" + base10Num + " in base " + base + " is " + convert(base10Num, base));
	}
	// -------------------------------------------------- 
	//   Converts a base 10 number to another base. 
	// --------------------------------------------------  
	public static String convert (int num, int b)
	{ 
		int quotient; 
		int remainder;
		quotient = num / b;
	    remainder = num % b;

	    String remain = "" + remainder;
	        
	    if (quotient == 0) {
	    	return remain;
	    } else {
	    	return convert(quotient, b) + remain;
	    }
	} 
} 