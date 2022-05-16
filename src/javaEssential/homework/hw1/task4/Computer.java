package javaEssential.homework.hw1.task4;

public class Computer {
    String name;
    public Computer(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("comp"+(i+1));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(computers[i].name);
        }
    }

}
