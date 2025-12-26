package pracitce7;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = 6;
        int[][] pyramid = new int[rows][];

        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] = random.nextInt(10, 90);
            }
        }
        System.out.println("Звичайна піраміда:");
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < rows - 1 - i; s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.printf("%3d   ", pyramid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Перевернута піраміда:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int s = 0; s < rows - 1 - i; s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < pyramid[i].length; j++) {
                System.out.printf("%3d   ", pyramid[i][j]);
            }
            System.out.println();
        }
    }
}
