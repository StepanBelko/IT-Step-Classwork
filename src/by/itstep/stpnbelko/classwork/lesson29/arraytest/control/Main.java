package by.itstep.stpnbelko.classwork.lesson29.arraytest.control;
import java.util.Scanner;

import static by.itstep.stpnbelko.classwork.lesson29.arraytest.logic.ArrayLogic.*;
import static by.itstep.stpnbelko.classwork.view.Printer.*;

public class Main extends Throwable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, -23, -8,  0, 6, 5, -5, -3, -22};
        System.out.println("A1.  Find not zero");

        String msg = String.format("how many non-zero elements are in the array? - %d", findNotZero(array));
        print(msg);

        System.out.println("B1.  Find items greater than N");
        System.out.println("Enter N");
        int N = scanner.nextInt();

        msg = String.format("How many items more than %d? - %d", N, findItemsMoreThanN(array, N));
        print(msg);

        System.out.println("B7.  Find |element| greater than N");
        System.out.println("Enter N");
        N = scanner.nextInt();
        msg = String.format("%d abs elements more than %d",findElementAbsMoreThanN(array, N), N);
        print(msg);

        System.out.println("C1");
        msg = String.format("%d elements more arithmetic mean",findElementMoreArithmeticMean(array));
        print(msg);

        System.out.println("D1. Is All elements are different?");
        msg = isAllElementsDifferent(array) ? "Yes, all elements are different" : "No. Elements are no different";
        print(msg);

        System.out.println("F1. ");
    }
}
