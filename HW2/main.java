import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions as JUnitAssertions;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double purchaseAmount = 100;
        double discountPercentage = 10;

        double result = calculator.calculateDiscount(purchaseAmount, discountPercentage);

        // Using AssertJ
        Assertions.assertThat(result).isEqualTo(90);

        // Alternatively, using JUnit 5
        JUnitAssertions.assertEquals(90, result, 0.001);
    }
}
