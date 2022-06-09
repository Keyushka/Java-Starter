package javaEssential.homework.hw3.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Создайте класс Printer. В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
// Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове соответствующего
// метода их экземпляра, строки, переданные в качестве аргументов методов, выводились разными цветами.
// Обязательно используйте приведение типов.

public class Main {
    public static void main(String[] args) {
        Printer blue = new BluePrinter();
        Printer red = new RedPrinter();
        Printer yellow = new YellowPrinter();
        Printer green = new GreenPrinter();
        List<Printer> printers = new ArrayList<>(Arrays.asList(blue, red, yellow, green));

        for (Printer p : printers) {
            p.print(p.getValue());
        }
    }
}
