package javaEssential.lessons.l1_oop.lesson.models;

public class Employee extends Person {
    private String position;
    public Employee(String name, String documents, int age, Account account, String position) {
        super(name, documents, age, account);
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println("Hello, I'm " + this.position);
    }
}
