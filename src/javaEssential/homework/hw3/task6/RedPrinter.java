package javaEssential.homework.hw3.task6;

public class RedPrinter extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[31m" + value + "\u001B[0m");
    }
}
