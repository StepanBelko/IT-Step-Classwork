package by.itstep.stpnbelko.classwork.lesson29.arraytest.control;
import java.util.Arrays;

import static by.itstep.stpnbelko.classwork.lesson29.arraytest.logic.LevelFLogic.*;
import static by.itstep.stpnbelko.classwork.view.Printer.*;

public class LevelF {
    //    Отсортировать элементы вектора по убыванию до первого/последнего элемента, равного нулю.
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 4, 9, 8, 0, 5, 4, 3, 6, 8, 2, 1, 0, 7, 7, 5};
        arraySortBeforeFirstZero(array);
        arraySortBeforeLastZero(array);
        print(Arrays.toString(array));
    }
}