import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = readNumberListFromConsole("Введите значения первого списка: ");
        List<Integer> list2 = readNumberListFromConsole("Введите значения второго списка: ");

        NumberListComparator comparator = new NumberListComparator();
        String result = comparator.compareLists(list1, list2);
        System.out.println(result);
    }

    @org.jetbrains.annotations.NotNull
    private static List<Integer> readNumberListFromConsole(String message) {
        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String[] numbers = scanner.nextLine().split(" ");

        for (String numStr : numbers) {
            try {
                int num = Integer.parseInt(numStr);
                numberList.add(num);
            } catch (NumberFormatException e) {
                System.out.println(numStr + " не является числом. Пропускаем.");
            }
        }

        return numberList;
    }
}