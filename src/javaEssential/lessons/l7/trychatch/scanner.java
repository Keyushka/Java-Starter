package javaEssential.lessons.l7.trychatch;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Пытаюсь что-то сделать");
            getResult();
            //System.exit(0);
        }catch (Exception e) {
            System.out.println("Ловлю все Exceptions");
        } finally {
            System.out.println("Выполняюсь всегда");
        }
    }
    public  static  void getResult() throws Exception {
        System.out.println("doing something");
        throw new Exception();
    }
}
