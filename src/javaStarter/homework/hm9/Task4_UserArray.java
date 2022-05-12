package javaStarter.homework.hm9;

import java.util.Arrays;

public class Task4_UserArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(increaseArrayLengthBy1(array)));
        System.out.println(Arrays.toString(addValueToArrayAs1stElement(array, 33)));

    }

    public static int[] increaseArrayLengthBy1(int[] array) {
        int[] add1 = new int[array.length + 1];
        System.out.println("Увеличение длины массива на 1 элемент: ");
        System.arraycopy(array, 0, add1, 0, array.length);
        return add1;
    }

    public static int[] addValueToArrayAs1stElement(int[] array, int value) {
        int[] add1 = new int[array.length + 1];
        System.out.println("Добавление указанного значения к массиву как 1й элемент: ");
        System.arraycopy(array, 0, add1, 1, array.length);
        add1[0] = value;
        return add1;
    }
}
