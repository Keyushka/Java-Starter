package javaStarter.lessons.lesson4;

public class Test {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = (a < b) ? 30 : 100; //тернарный оператор = если a < b, то с = 30, иначе с = 100
        if (a < b) {
            System.out.println("a<b");
        } else if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println(c);
        }
        switch (a){
            case 5:
                System.out.println("6");
                break;
            case 6:
                System.out.println("7");
                break;
        }
    }
}
