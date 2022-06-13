package javaEssential.lessons.l7.project.exceptions;

public class PizzaNotFoundException extends Exception{
    public PizzaNotFoundException(String message) {
        super(message);
    }
}
