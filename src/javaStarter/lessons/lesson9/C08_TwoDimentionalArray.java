package javaStarter.lessons.lesson9;

import java.util.Scanner;

public class C08_TwoDimentionalArray {
    // Массивы состоящие из одного элемента.

    public static void main(String[] args) {
        int[] vector = new int[1];
        vector[0] = 100;
        System.out.println(vector[0]);
        try (Scanner sc = new Scanner(System.in)){
        int[][] matrix = new int[1][1];
        matrix[0][0] = 200;
        System.out.println(matrix[0][0]);
          } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы вышли за пределы массива");
        }
    }
}
