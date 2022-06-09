package javaEssential.homework.hw3.task6;

public class YellowPrinter extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[33m" + value + "\u001B[0m");
    }
}
