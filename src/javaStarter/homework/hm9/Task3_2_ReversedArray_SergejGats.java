package javaStarter.homework.hm9;

import java.util.Arrays;

public class Task3_2_ReversedArray_SergejGats {

    public static void main(String[] args) { // просто для проверки методов
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(subArray(array, 5, 12)));
    }

    static int[] subArray(int[] array, int index, int count) {
        int[] cutArray = new int[count];
        int j = 0;

        for (int i = (index - 1); i < (index + count - 1); i++) {
            if (array.length > i) {
                cutArray[j] = array[i];
            } else {
                cutArray[j] = 1;
            }
            j++;
        }
        return cutArray;
    }
}
