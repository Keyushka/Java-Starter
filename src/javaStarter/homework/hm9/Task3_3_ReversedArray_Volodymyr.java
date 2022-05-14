package javaStarter.homework.hm9;

import java.util.Arrays;

public class Task3_3_ReversedArray_Volodymyr {
    public static void main(String[] args) { // просто для проверки методов
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(subArray(array, 5, 3)));
    }
    static int[] subArray(int[] array, int index, int count) {
        int[] newArr = new int[count];
        for (int i = index, j = 0; j < newArr.length; i++, j++) {
            if (i <= array.length - 1) {
                newArr[j] = array[i];
            } else {
                newArr[j] = 1;
            }
        }
        return newArr;
    }
}
