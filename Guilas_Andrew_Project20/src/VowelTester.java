import java.util.Scanner;

public class VowelTester {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        VowelCounter vowelCounter = new VowelCounter();
        int vowelCount = vowelCounter.count(word);
        System.out.println("The word \"" + word + "\" has " + vowelCount + " vowels");

        scanner.close();
    }
}
