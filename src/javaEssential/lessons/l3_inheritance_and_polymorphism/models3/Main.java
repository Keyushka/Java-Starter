package javaEssential.lessons.l3_inheritance_and_polymorphism.models3;

public class Main {
    public static void main(String[] args) {
        Database instance = Database.getInstance("http://localhost:8080?");
        Database instances = Database.getInstance("http://localhost:8080?");
        Database instanced = Database.getInstance("http://localhost:8080?");
        System.out.println(instance);
        System.out.println(instances);
        System.out.println(instanced);
    }
}
