package javaStarter.homework.hm6;

public class Task3_Triangle {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println("Прямоугольник");
        for (int i = 0; i < y; i++) {
            // Внутренний цикл для печати одной строки
            for (int k = 0; k < x; k++) {
                if (k == 0 || k == x - 1 || i == 0 || i == y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        x = 6;
        System.out.println("Прямоугольный треугольник");
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < i + 1; k++) {
                if (k == 0 || k == i || i == x - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("Равносторонний треугольник");
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < 2 * i - 1; k++) {
                if (k == 0 || k == 2 * i - 2 || i == x - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("Ромб");
        for (int k = 1; k <= x; k++) {
            for (int i = x - 1; i >= k; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j < k * 2; j++) {
                if (j == 1 || j == k * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int k = x - 1; k >= 1; k--) {
            for (int i = x - 1; i >= k; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j < k * 2; j++) {
                if (j == 1 || j == k * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}


/*        // Верхняя часть
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < 2 * i - 1; k++) {
                if (k == 0 || k == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
        }
        // Нижняя часть
        for (int i = 0; i < x; i++) {
            for (int k = x; k > 2 * i - 1; k--) {
                if (k == x || k == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            for (int j = x; j > x - i; j--) {
                System.out.print(" ");
            }
        }*/