package javaEssential.lessons.l5.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Object());
        list.add(1);
        list.add(235.52);
        for (Object o: list) {
            System.out.println(o);
        }
    }
}
