package javaEssential.lessons.l7.trychatch;

public class Main {
    public static void main(String[] args) {
        try{
            int a = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Поймали ошибку" + e);
        } finally {
            System.out.println("Всегда выполняюсь");
        }
        System.out.println("init");
    }
}
