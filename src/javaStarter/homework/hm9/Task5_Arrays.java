package javaStarter.homework.hm9;

public class Task5_Arrays {
    public static void main(String[] args) {
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Имеется массив размерностью в 10 элементов: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("\nВсе элементы массива в обратном порядке: ");
        for (int i = N-1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
