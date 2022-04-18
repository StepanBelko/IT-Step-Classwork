package by.itstep.stpnbelko.classwork.lesson29.arraytest.logic;

import static by.itstep.stpnbelko.classwork.lesson29.arraytest.logic.ArrayLogic.*;
import static by.itstep.stpnbelko.classwork.lesson29.arraytest.logic.LevelFLogic.*;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class ArrayLogicTest {

    //  A1. Find non zero elements test
    @Test
    public void testFindNotZeroWithNull() {
        assertEquals(-1, findNotZero(null));
    }

    @Test
    public void testFindNotZeroWithZeroLength() {
        assertEquals(-1, findNotZero(new int[0]));
    }

    @Test
    public void testFindNotZeroWithAllZero() {
        int[] array = {0, 0, 0, 0, 0, 0, 0};
        assertEquals(0, findNotZero(array));
    }

    @Test
    public void testFindNotZeroWithAllNoZero() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(9, findNotZero(array));
    }

    @Test
    public void testFindNotZeroOnlyOneZero() {
        int[] array = {1, 2, 3, 4, 5, 0, 7, 8, 9};
        assertEquals(8, findNotZero(array));
    }

    //    B1.  Find items greater than N test"
    @Test
    public void testFindItemsMoreThanNNull() {
        assertEquals(-1, findItemsMoreThanN(null, 0));
    }

    @Test
    public void testFindItemsMoreThanNZeroLength() {
        assertEquals(-1, findItemsMoreThanN(new int[0], 0));
    }

    @Test
    public void testFindItemsMoreThanNNoElements() {
        assertEquals(0, findItemsMoreThanN(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 20));
    }

    @Test
    public void testFindItemsMoreThanNAllElements() {
        assertEquals(10, findItemsMoreThanN(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -10));
    }

    @Test
    public void testFindItemsMoreThanNOneElement() {
        assertEquals(1, findItemsMoreThanN(new int[]{1, 2, 3, 4, 5, 60, 7, 8, 9, 0}, 10));
    }


    //    Сортировка массива до первого/последнего нуля
    @Test
    public void testSortBeforeFirstZero() {
        int[] array = {1, 3, 2, 4, 0, 9, 8, 7, 6, 5};
        int[] arrayExpected = {1, 2, 3, 4, 0, 9, 8, 7, 6, 5};
        arraySortBeforeFirstZero(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != arrayExpected[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZero() {
        int[] array = {1, 3, 2, 4, 0, 9, 8, 7, 6, 0};
        int[] arrayExpected = {0, 1, 2, 3, 4, 6, 7, 8, 9, 0};
        arraySortBeforeLastZero(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != arrayExpected[i]) {
                fail();
            }
        }

    }

    @Test
    public void testSortBeforeFirstZeroWithoutZeroElement() {
        int[] array = {1, 3, 2, 4, 9, 8, 7, 6, 5};
        int[] arrayExpected = {1, 3, 2, 4, 9, 8, 7, 6, 5};
        arraySortBeforeFirstZero(array);
        assertArrayEquals(arrayExpected, array);
    }
}
