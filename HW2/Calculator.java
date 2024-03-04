import org.assertj.core.api.Assertions;

public class Calculator {

    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException(
                    "Неверный ввод. Сумма покупки и процент скидки должны быть неотрицательными, а процент скидки должен быть меньше или равен 100.");
        }
        return purchaseAmount - (purchaseAmount * discountPercentage / 100);
    }
}
