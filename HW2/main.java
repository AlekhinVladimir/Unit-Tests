import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double result = calculator.calculateDiscount(purchaseAmount, discountPercentage);

        System.out.println("Result: $" + result);
    }
}
