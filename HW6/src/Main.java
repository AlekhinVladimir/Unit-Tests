

// HW 3.2. Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%

public class Main {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // HW 3.2. Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean isInRange(int n) {
        return n > 25 && n < 100;
    }


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.evenOddNumber(3));
        System.out.println(main.isInRange(50));
    }
}