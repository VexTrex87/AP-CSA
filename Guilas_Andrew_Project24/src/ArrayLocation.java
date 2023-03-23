import java.util.Random;
import java.util.Arrays;

public class ArrayLocation {

	public static int locate(int[] intArray, int value) {
		for (int i = 0; i < intArray.length; i++) {
			int currentValue = intArray[i];
			if (currentValue == value) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void locate_print(int[] intArray, int value) {
		int i = locate(intArray, value);
		if (i == -1) {
			System.out.println(value + " DOES NOT EXIST IN THIS ARRAY");
		} else {
			System.out.println(value + " IS LOCATED IN POSITION " + i);
		}
	}
	
	public static void main(String[] args) {

		// create & print new random array
		
		int[] intArray = new int[100];
		
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int randomInt = random.nextInt(1, 1001);
			intArray[i] = randomInt;
		}
	
		System.out.println(Arrays.toString(intArray));
		
		// find values in array
		// use a separate method to reduce code

		locate_print(intArray, 347);
		locate_print(intArray, 70);
		locate_print(intArray, 245);
		locate_print(intArray, 23);
		locate_print(intArray, 633);
		locate_print(intArray, 90);
		locate_print(intArray, 394);
		
	}

}
