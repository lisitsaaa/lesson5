import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] matrix2 = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix3[0].length; i++) {
            for (int j = 0; j < matrix3.length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] = matrix3[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix3));
    }
}
