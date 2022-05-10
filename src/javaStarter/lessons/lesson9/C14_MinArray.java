package javaStarter.lessons.lesson9;

import java.util.Arrays;

public class C14_MinArray {
    public static void main(String[] args) {
        // На 7 строке создаем массив целочисленных элементов с именем array размерностью в 10 элементов

        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        // На 11 строке создаем целочисленную переменную min и заносим в неё число, которое содержится в нулевом индексе массива

        int min = list[0];

        // На 15 строке пробегаемся по всему массиву и на 16-й строке проверяем, массив с i-м индексом меньше ли значения переменной min
        // На 17 строке если переменная min больше значения list[i], то присваиваем ей это число
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }
        System.out.println("Min is " + min);
        ///------
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());
       // Arrays.copyOf();
        Arrays.sort(list);
        System.out.println(list[0]);
    }
}
