package javaEssential.lessons.l2_classes_and_objects.stat;

public class Account {
    double UAH;
    String name;
    static double courseUSDtoUAH;

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Robert";
        a1.UAH = 2000.05;
        Account.courseUSDtoUAH = 26.1;
        Account a2 = new Account();
        a2.name = "Edward";
        a2.UAH = 1800;
    }
}
