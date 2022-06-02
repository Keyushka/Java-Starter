package javaEssential.lessons.l3.models2;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doAnimalActions(){
        System.out.println("Звери что-то делают");
    }
}
