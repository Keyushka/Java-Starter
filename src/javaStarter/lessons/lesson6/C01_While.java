package javaStarter.lessons.lesson6;

public class C01_While {
    // Циклическая конструкция - while.

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 3) {
            counter++;
            System.out.println("Counter " + counter);
        }

        System.out.println("Произведено " + counter + " итераций.");
    }
}
