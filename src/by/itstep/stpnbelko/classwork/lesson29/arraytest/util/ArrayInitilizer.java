package by.itstep.stpnbelko.classwork.lesson29.arraytest.util;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitilizer {

    public static void initRandomArray(int[] array, int max, int min) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void userInit(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }
}
