package by.itstep.stpnbelko.classwork.lesson33.model.logic;

public class RecursionLogic {
    public static int findSumOfDigit(int digit) {
        digit = digit > 0 ? digit : -digit;
        if (digit < 10) {
            return digit;
        }
        return digit % 10 + findSumOfDigit(digit / 10);
    }

    public static int findSumArrayElements(int[] array) {
        int index = array.length - 1;
        if (index == 0) {
            return array[index];
        }
        return countArraySum(array, index);
    }

    private static int countArraySum(int[] array, int index) {
        if (index == 0) {
            return array[index];
        }

        return array[index] + countArraySum(array, --index);
    }

}
