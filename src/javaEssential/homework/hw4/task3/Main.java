package javaEssential.homework.hw4.task3;

import javaEssential.homework.hw4.task3.impl.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        usingPlayerFunctions(scan);
    }
    private static void usingPlayerFunctions (Scanner scan) {
        boolean input = true;
        Player player = new Player();
        System.out.println("\u001B[35m" + "Меню плеера: 1 - проигрывание, 2 - запись, 0 - выход" + "\u001B[0m");
        System.out.println("Для использования плеера введите соответствующий код функции: ");
        while (input) {
            switch (scan.next()) {
                case "1": {
                    player.play();
                    break;
                }
                case "2": {
                    player.record();
                    break;
                }
                case "0": {
                    input = false;
                    System.out.println("Выход из программы");
                    break;
                }
                default: {
                    System.out.println("Программа не распознала код функции. Возможно вы ошиблись. Попробуйте снова.");
                }
            }
        }
    }
}
