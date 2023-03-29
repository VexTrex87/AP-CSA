import java.util.Arrays;

public class Jailer {

	public static void main(String[] args) {
		Boolean[] prisoners = new Boolean[1001];
		Arrays.fill(prisoners, false); // locked is true, unlocked is false
						
		for (int i = 2; i <= 1000; i++) {
			for (int j = i; j <= 1000; j+= i) {
				prisoners[j] = !prisoners[j];
			}
		}
						
		for (int i = 1; i <= 1000; i++) {
			if (prisoners[i] == false) {
				System.out.println(i);
			}
		}
				
	}

}
