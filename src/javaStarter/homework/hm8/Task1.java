package javaStarter.homework.hm8;

public class Task1 {
    public static void main(String[] args) {
        int a = 1000;
        /*while (a < 9997) {
            a += 3;
            System.out.print(a + " ");
        }*/

        while (a < 10000) {
            a += 3;
            if (a >= 10000) break;
            System.out.print(a + " ");

        }
       // counter++;

    }
}
