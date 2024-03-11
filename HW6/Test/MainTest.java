
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class MainTest {
        @Test
        public void testEvenOddNumber() {
            Main main = new Main();

            assertTrue(main.evenOddNumber(2)); // 2 четное, метод возвращает true
            assertFalse(main.evenOddNumber(3)); // 3 нечетное, метод возвращает false
            assertTrue(main.evenOddNumber(0)); // 0 четное, метод возвращает true
        }

        @Test
        public void testIsInRange() {
            Main main = new Main();
            assertTrue(main.isInRange(50)); // число внутри интервала
            assertFalse(main.isInRange(10)); // число меньше интервала
            assertFalse(main.isInRange(200)); // число больше интервала

            assertFalse(main.isInRange(25)); // нижняя граница интервала
            assertFalse(main.isInRange(100)); // верхняя граница интервала

            assertTrue(main.isInRange(26)); // число внутри интервала
            assertTrue(main.isInRange(99)); // число внутри интервала
        }
    }

