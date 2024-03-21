import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberListComparatorTest {

    @Test
    public void testCompareLists_firstListGreater() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);

        Assert.assertEquals("Первый список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_secondListGreater() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(4);

        Assert.assertEquals("Второй список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_listsEqual() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);

        Assert.assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }
}