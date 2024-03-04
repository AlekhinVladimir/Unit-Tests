import org.assertj.core.api.Assertions;

public class Calculator {

    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException(
                    "Invalid input. Purchase amount and discount percentage must be non-negative and discount percentage must be less than or equal to 100.");
        }
        return purchaseAmount - (purchaseAmount * discountPercentage / 100);
    }
}
