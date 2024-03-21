import java.util.List;
import java.util.Objects;

public class NumberListComparator {

    public String compareLists(List<Integer> list1, List<Integer> list2) {
        String result;
        double average1 = list1.stream()
                .filter(Objects::nonNull) // Фильтруем null-значения
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        double average2 = list2.stream()
                .filter(Objects::nonNull) // Фильтруем null-значения
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        if (average1 > average2) {
            result = "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }
        return result;
    }

    private double calculateAverage(List<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }
}