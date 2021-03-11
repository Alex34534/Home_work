import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




public class Sorttest {
    @Test
    public void checkSortTest() {
        int[] i = {25, -3, 34, 0, -4};
        int[] expectedArray = {-4, -3, 0, 25, 34};
        Sort.sorter(i);
        Assertions.assertArrayEquals(expectedArray, i); // Проверка того, что сортировка сортирует корректно

    }

    @Test
    public void emptinessTest() {
        int[] i = {0};
        int[] expectedArray = {0};
        Sort.sorter(i);
        Assertions.assertArrayEquals(expectedArray, i); // Проверка того, что метод работает с '0'
    }

    @Test
    public void bignumberTest() {
        int[] i = {2147483647, -2147483648, 0, -2147483647, 1};
        int[] expectedArray = {-2147483648, -2147483647, 0, 1, 2147483647};
        Sort.sorter(i);
        Assertions.assertArrayEquals(expectedArray, i);// Проверка граничных значений для типа int
    }

    @Test
    public void emptinessNull() {
        int[] i = {};
        int[] expectedArray = {};
        Sort.sorter(i);
        Assertions.assertArrayEquals(expectedArray, i); // Проверка того, что метод работает c 'пустотой'
    }

    @Test
    public void repeatTest () {
        int[] i = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        int[] expectedArray = {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        Sort.sorter(i);
        Assertions.assertArrayEquals(expectedArray, i); // Проверка того, что метод отработает с множеством одинаковых чисел

    }

}