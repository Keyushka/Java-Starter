package javaEssential.lessons.l8.generic.mod2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? super Food> list = new ArrayList<>();
        list.add(new Orange());
        list.add(new Fruit());
        list.add(new Food());

    }
    public  static  void test (List<? extends Orange> fruits)
    {
        fruits.get(0).doFoodAction();
        fruits.get(0).doFruitAction();
        fruits.get(0).doOrangeAction();
    }

    /*public  static  void test2 (List<? super Orange> fruits)
    {
        fruits.get(0).doFoodAction();
        fruits.get(0).doFruitAction();
        fruits.get(0).doOrangeAction();
    }*/

    public static <T extends Orange> void test(T t) {

    }

}
