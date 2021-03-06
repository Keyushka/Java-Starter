package javaStarter.lessons.lesson9;

public class C10_ThreeDimensionalArrayFill {
    // Массивы (трехмерный массив).

    public static void main(String[] args) {
        int[][][] array = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };

        System.out.println(array.length); //строки
        System.out.println(array[0].length); //индекса длина
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}


