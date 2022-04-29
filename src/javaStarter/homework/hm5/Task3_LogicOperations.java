package javaStarter.homework.hm5;

public class Task3_LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        System.out.println("Начальные значения переменных: x = 5, y = 10, z = 15");
        x += y >> x++ * z;
        System.out.println("\nЕсли мы используем 1ю операцию расчета: x += y >> x++ * z");
        System.out.println("Значения переменных будут: x = " + x + ", y = " + y + ", z = " + z);
        z = ++x & y * 5;
        System.out.println("\nЕсли мы используем 2ю операцию расчета: z = ++x & y * 5");
        System.out.println("Значения переменных будут: x = " + x + ", y = " + y + ", z = " + z);
        y /= x + 5 | z;
        System.out.println("\nЕсли мы используем 3ю операцию расчета: y /= x + 5 | z");
        System.out.println("Значения переменных будут: x = " + x + ", y = " + y + ", z = " + z);
        z = x++ & y * 5;
        System.out.println("\nЕсли мы используем 4ю операцию расчета: z = x++ & y * 5");
        System.out.println("Значения переменных будут: x = " + x + ", y = " + y + ", z = " + z);
        x = y << x++ ^ z;
        System.out.println("\nЕсли мы используем 5ю операцию расчета: x = y << x++ ^ z");
        System.out.println("Значения переменных будут: x = " + x + ", y = " + y + ", z = " + z);
    }
}
