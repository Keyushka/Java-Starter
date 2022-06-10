package javaEssential.lessons.l4_abstraction.models2;

public class Main {
    public static void main(String[] args) {
        CDPlayer player = new MP4Player();
        player.print();
        CDPlayer.debug();

    }
}
