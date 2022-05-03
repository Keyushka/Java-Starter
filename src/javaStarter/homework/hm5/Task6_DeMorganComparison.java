package javaStarter.homework.hm5;

public class Task6_DeMorganComparison {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Условие до применения теоремы Де Моргана.
        if (a | b)
            System.out.println("A | B = " + (a | b));
        else
            System.out.println("A | B = " + (a | b));

        // Условие после применения теоремы Де Моргана.
        if (!(!a & !b))
            System.out.println("!(!A & !B) = " + !(!a & !b));
        else
            System.out.println("!(!A & !B) = " + !(!a & !b));
    }
}
