package javaEssential.lessons.l6.enumconstants;

public class Main {
    public static void main(String[] args) {
        PizzaSizeEnum pizza1 = PizzaSizeEnum.MIDDLE;
        System.out.println(pizza1.getPizzaSize());

        for(PizzaSizeEnum p : PizzaSizeEnum.values()) {
            System.out.println(p.getPizzaSize());
        }
    }
}
