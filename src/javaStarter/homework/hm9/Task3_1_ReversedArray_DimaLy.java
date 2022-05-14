package javaStarter.homework.hm9;

import java.util.Arrays;

public class Task3_1_ReversedArray_DimaLy {

    static int[] myReverse(int[] numbers) {

        for (int i = 0; i < (numbers.length / 2); i++) {

            int temp;
            temp = numbers.length - 1 - i;
            numbers[(numbers.length - 1 - i)] = numbers[i];
            numbers[i] = temp;

        }

        return numbers;
    }

    static int[] subArray(int[] array, int index, int count) {

        int[] res = Arrays.copyOfRange(array, index, (count + index));
        for (int i = (array.length - index); i < count; i++) {
            res[i] = 1;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] array1 = {0, 1, 2, 3, 4, 5};
        int[] array2 = {0, 1, 2, 3, 4, 5};
        int index = 0;
        int count = 10;

        System.out.println(Arrays.toString(myReverse(array1)));
        System.out.println(Arrays.toString(subArray(array2, index, count)));


    }
}