package javaStarter.homework.hm4;

import java.util.Scanner;

public class Task5_Translator {
    public static void main(String[] args) {
        String engWorld;
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа русско-английский переводчик знает 10 слов о погоде: погода, дождь, солнце, туман, радуга, снег, гроза, ветер, тепло, холодно");
        System.out.println("Введите слово (о погоде) на русском языке: ");
        String ruWorld = sc.next();

        // Вариант 1
        /*switch (ruWorld) {
            case "погода": {
                engWorld = "weather";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "дождь": {
                engWorld = "rain";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "солнце": {
                engWorld = "sun";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "туман": {
                engWorld = "fog";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "радуга": {
                engWorld = "rainbow";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "снег": {
                engWorld = "snow";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "гроза": {
                engWorld = "thunderstorm";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "ветер": {
                engWorld = "wind";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "тепло": {
                engWorld = "warmly";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            case "холодно": {
                engWorld = "cold";
                System.out.println("Перевод этого слова на английском языке: " + engWorld);
                break;
            }
            default:  {
                System.out.println("Для указанного слова отсутствует перевод.");
                break;
            }
        }*/

        // Вариант 2
        String translate = "Перевод этого слова на английском языке: ";
        String noRuWorld = "Для указанного слова отсутствует перевод.";
        engWorld = (ruWorld.equals("погода")) ? "weather" :
                (ruWorld.equals("дождь")) ? "rain" :
                        (ruWorld.equals("солнце")) ? "sun" :
                                (ruWorld.equals("туман")) ? "fog" :
                                        (ruWorld.equals("радуга")) ? "rainbow" :
                                                (ruWorld.equals("снег")) ? "snow" :
                                                        (ruWorld.equals("гроза")) ? "thunderstorm" :
                                                                (ruWorld.equals("ветер")) ? "wind" :
                                                                        (ruWorld.equals("тепло")) ? "warmly" :
                                                                                (ruWorld.equals("холодно")) ? "cold" :
                                                                                        "отсутствует перевод";
        if (engWorld.equals("отсутствует перевод")){
            System.out.println(noRuWorld);
        } else{
            System.out.println(translate + engWorld);
        }
    }
}
