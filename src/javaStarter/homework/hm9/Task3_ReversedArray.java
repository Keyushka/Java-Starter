package javaStarter.homework.hm9;

import java.util.Arrays;

public class Task3_ReversedArray {
    public static void main(String[] args) { // просто для проверки методов
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        myReverse(array);
        System.out.println(Arrays.toString(myReverse2(array)));
        System.out.println(Arrays.toString(subArray(array, 5, 7)));
    }

    // Не совсем понятно по заданию какой из этих методов нужно было сделать: myReverse или myReverse2
    // Один из них точно должен подойти:)
    public static void myReverse(int[] array) {
        System.out.println("Все элементы массива в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] myReverse2(int[] array) {
        int[] reverse = new int[array.length];
        System.out.println("\nВсе элементы массива в обратном порядке: ");
        for (int i = 0, k = reverse.length - 1; i < array.length; i++, k--) {
            reverse[k] = array[i];
        }
        return reverse;
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] subArr = new int[count];
        int numElements = array.length - index; // количество элементов, которые входят в выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента)

        if (count <= numElements) {
            System.out.println("\nЧасть элементов массива если count <= от index до длины исходного массива: ");
            for (int i = 0, j = index; i <= count - 1; i++, j++) {
                subArr[i] = array[j];
            }
        } else if (count > numElements) {
            System.out.println("\nЧасть элементов массива если count > от index до длины исходного массива: ");
            for (int i = count - numElements, j = index, k = 0; i <= count - 1; i++, j++, k++) {
                subArr[i] = array[j];
                if (subArr[k] == 0) {
                    subArr[k] = 1;
                }
            }
        }
        return subArr;
    }
}
