import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testCalculateDiscount_validInput() {
        double purchaseAmount = 100;
        double discountPercentage = 10;
        double expected = 90;

        double actual = calculator.calculateDiscount(purchaseAmount, discountPercentage);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCalculateDiscount_negativePurchaseAmount() {
        double purchaseAmount = -100;
        double discountPercentage = 10;

        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining(
                        "Неверный ввод. Сумма покупки и процент скидки должны быть неотрицательными, а процент скидки должен быть меньше или равен 100.");
    }

    @Test
    public void testCalculateDiscount_negativeDiscountPercentage() {
        double purchaseAmount = 100;
        double discountPercentage = -10;

        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining(
                        "Неверный ввод. Сумма покупки и процент скидки должны быть неотрицательными, а процент скидки должен быть меньше или равен 100.");
    }

    @Test
    public void testCalculateDiscount_discountPercentageGreaterThan100() {
        double purchaseAmount = 100;
        double discountPercentage = 110;

        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining(
                        "Неверный ввод. Сумма покупки и процент скидки должны быть неотрицательными, а процент скидки должен быть меньше или равен 100.");
    }
}