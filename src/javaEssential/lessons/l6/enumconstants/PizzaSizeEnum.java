package javaEssential.lessons.l6.enumconstants;

public enum PizzaSizeEnum {
    SMALL("Very small pizza"),
    MIDDLE("Middle pizza"),
    BIG("Big pizza");
    private final String pizzaSize;

    PizzaSizeEnum(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }
}
