package pracitce7;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {

        int n = 5;
        int[][] matrix = new int[n][n];
        int[][] ext = new int[n][n + 4];
        Random random = new Random();

        System.out.println("Матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ext[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                ext[i][j + n] = matrix[i][j];
            }
        }

        int diagplus = 0;
        int diagminus = 0;

        for (int start = 0; start < n; start++) {
            int prod = 1;
            for (int i = 0; i < n; i++) {
                prod *= ext[i][start + i];
            }
            diagplus += prod;
        }

        for (int start = n - 1; start < n + 4; start++) {
            int prod = 1;
            for (int i = 0; i < n; i++) {
                prod *= ext[i][start - i];
            }
            diagminus += prod;
        }
        System.out.println("\nВизначник = " + (diagplus - diagminus));
    }
}