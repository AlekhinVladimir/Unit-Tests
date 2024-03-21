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

    @Test
    public void testCompareLists_singleValueLists() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(9);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);

        Assert.assertEquals("Первый список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_emptyLists() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Assert.assertEquals("Средние значения равны", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_invalidDataInLists() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(null);
        list2.add(2);
        list2.add(3);
        list2.add(10);

        Assert.assertEquals("Второй список имеет большее среднее значение", comparator.compareLists(list1, list2));
    }

    @Test
    public void testCompareLists_invalidLengthOfList() {
        NumberListComparator comparator = new NumberListComparator();

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        Assert.assertEquals("Первый список имеет большее среднее значение", comparator.compareLists(list1, list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);

        Assert.assertEquals("Второй список имеет большее среднее значение", comparator.compareLists(list3, list4));
    }
}