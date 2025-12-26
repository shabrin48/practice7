package pracitce7;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[][] matrix;
        int n;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці: ");
        n = sc.nextInt();
        matrix = new int[n][n];

        System.out.println("Матриця: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.printf("%3d   ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.print("Введіть номер рядка (0..." + (n - 1) + "): ");
        int row = sc.nextInt();

        System.out.print("Введіть номер стовбця (0..." + (n - 1) + "): ");
        int column = sc.nextInt();

        int[][] minor = new int[n - 1][n - 1];

        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == column) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }

        System.out.println("Мінорна матриця:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.printf("%3d   ", minor[i][j]);
            }
            System.out.println();
        }

        int minorValue = determinant2x2(minor);
        System.out.println("Мінор елемента = " + minorValue);

        sc.close();
    }

    static int determinant2x2(int[][] m) {
        if (m.length == 2) {
            return m[0][0] * m[1][1] - m[0][1] * m[1][0];
        }
        return 0;
    }
}
