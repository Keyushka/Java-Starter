package javaStarter.homework.hm8;

public class w {
    /*static boolean method1() {
        System.out.println("Method1");
        return true;
    }
    static boolean method2() {
        System.out.println("Method2");
        return false;
    }
    public static void main(String[] args) {
        if (method1() & method2())
            System.out.println(2);
    }*/
        private static void myMethod(int a, int b) {
            int c = a;
            a = b;
            b = c;
        }

        public static void main(String[] args) {
            int a = 1, b = 2;
            myMethod(a, b);
            System.out.println("a=" + a + ", b=" + b);
        }
    /*static int method(int a) {
        int b = a + 2;
        return b;
    }

    public static void main(String[] args) {
        int operand = 3;
        int result = method(operand);
        System.out.println(operand + "; " + result + ";");
    }*/
    /*static int method(int a) {
        a = 2;
        return a * 2;
    }
    public static void main(String[] args) {
        int operand = 3;
        int result = method(operand);
        System.out.println(operand + ", " + result);
    }*/

}
