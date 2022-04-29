package javaStarter.lessons.lesson5;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
       /* a = a + b; // 12
        b = a - b; // 5
        a = a - b;*/
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;



        System.out.println(a);
        System.out.println(b);

    }
}
