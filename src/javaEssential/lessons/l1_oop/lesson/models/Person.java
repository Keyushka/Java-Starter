package javaEssential.lessons.l1_oop.lesson.models;

public class Person {
    private String name;
    private String documents;
    private int age;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocuments() {
        return documents;
    }

    public void setDocuments(String documents) {
        this.documents = documents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Person(String name, String documents, int age, Account account) {
        this.name = name;
        this.documents = documents;
        this.age = age;
        this.account = account;
    }
    public void print() {
        System.out.println("Hello, I'm " + name);
    }

    public void print(String welcomeMessage) {
        System.out.println("Hello, I'm " + name);
    }

    public void print(String welcomeMessage, int age) {
        System.out.println("Hello, I'm " + name);
    }
}
