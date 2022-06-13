package javaEssential.lessons.l7.project;

import javaEssential.lessons.l7.project.exceptions.PizzaNotFoundException;
import javaEssential.lessons.l7.project.models.Pizza;
import javaEssential.lessons.l7.project.models.PizzaSizeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please, enter name of the pizza: ");
            String name = sc.nextLine();
            System.out.println("Please, enter price of the pizza: ");
            int price = sc.nextInt();
            System.out.println("Please, enter size of the pizza: ");
            int size = sc.nextInt();
            try {
                pizzas.add(new Pizza(name, price, PizzaSizeEnum.getPizzaSizeNameBySize(size)));
            } catch (PizzaNotFoundException p) {
                System.out.println(p.getMessage());
            }
            System.out.println(pizzas);
        }
    }
}
