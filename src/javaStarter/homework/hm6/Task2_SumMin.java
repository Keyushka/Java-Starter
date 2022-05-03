package javaStarter.homework.hm6;

public class Task2_SumMin {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;
        while (a < b){
            a++;
            if (a < b) {
                sum += a;
            }
        }
        System.out.println("Сума всех чисел, расположенных между числами A и B = " + sum);
        a = 10;
        System.out.println("Все нечетные значения, расположенные между числами A и B:");
        while (a < b){
            a++;
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
}
