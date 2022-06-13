package javaEssential.lessons.l7.trychatch;

public class Throw {
    public static void main(String[] args) {
        System.out.println("init");
        try {
            throw new Exception("что-то случилось");
        } catch (Exception e) {
            System.out.println("log");
            throw new RuntimeException(e);
        }
    }
}
