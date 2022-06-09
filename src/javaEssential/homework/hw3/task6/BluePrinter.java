package javaEssential.homework.hw3.task6;

public class BluePrinter extends Printer{
    @Override
    void print(String value) {
        super.print("\u001B[34m" + value + "\u001B[0m");
    }
}
