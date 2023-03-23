import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        FactorGenerator factorGenerator = new FactorGenerator(n);

        while (true) {
            int nextFactor = factorGenerator.nextFactor();

            boolean hasMoreFactors = factorGenerator.hasMoreFactors();
            if (hasMoreFactors == false) {
                break;
            }

            System.out.println(nextFactor);
        }

        scanner.close();
    }
}
