package javaEssential.lessons.l8.generic.mod3;
// Создать метод printArray, который умеет выводить массивы всех типов
// Метод, который добавляет все элементы массива в коллекцию

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 10, 66, 8};
        String[] strings = {"Str1", "Str2", "Str3"};
        List<Integer> list = new ArrayList<>();
        addAllElements(ints, list);

        printElements(ints);
        printElements(strings);

        //SpecPrinter specPrinter = new SpecPrinter();
    }

    public static <E> void printElements(E[] someArray) {
        for (E element : someArray) {
            System.out.println(element);
        }
    }

    public static <T> void addAllElements(T[] allArray, Collection<T> collection) {
        for (int i = 0; i < allArray.length; i++) {
            collection.add(allArray[i]);
        }
    }
}
