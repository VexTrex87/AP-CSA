import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class VictimTester {

	public static void main(String[] args) throws IOException {		
		File file = new File("bonetest.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String row = scanner.nextLine();
			String[] data = row.split(" ");

			String sex = data[0];
			String boneType = data[1];
			int age = Integer.valueOf(data[2]);
			double boneLength = Double.valueOf(data[3]);
			
			Victim victim = new Victim(sex, boneType, age, boneLength);
			String dataString = victim.toString();
			System.out.println(dataString);
			
			double height = victim.getHeight();
			System.out.println(Math.round(height * 100.0) / 100.0);
			
			System.out.print("\n");
		}

		scanner.close();
		
	}

}
