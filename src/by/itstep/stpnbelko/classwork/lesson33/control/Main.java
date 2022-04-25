package by.itstep.stpnbelko.classwork.lesson33.control;
import static by.itstep.stpnbelko.classwork.lesson33.model.logic.RecursionLogic.*;

public class Main {
    public static void main(String[] args) {

        int digit = -123456789;
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(findSumOfDigit(digit));
        System.out.println(findSumArrayElements(array));
    }
}
