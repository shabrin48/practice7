package pracitce7;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double[][] array;
        int rows;
        int columns;

        System.out.print("Введіть кількість рядків: ");
        rows = scanner.nextInt();

        System.out.print("Введіть кількість стовпців: ");
        columns = scanner.nextInt();

        array = new double[rows][columns];

        System.out.println("Поточний масив: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextDouble(1, 10);
                System.out.printf("%5.2f   ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("Змінений масив: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }
                System.out.printf("%5.2f   ", array[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
