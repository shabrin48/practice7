package pracitce7;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] matrix;
        int[][] transMatrix;

        System.out.print("Введіть розмір матриці: ");
        n = scanner.nextInt();
        matrix = new int[n][n];
        transMatrix = new int[n][n];

        System.out.println("Матриця: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10, 90);
                System.out.printf("%3d   ", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Транспонована матриця: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d   ", transMatrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
