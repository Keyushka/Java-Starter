package javaEssential.homework.hw3.task6;

public class GreenPrinter extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[32m" + value + "\u001B[0m");
    }
}
