import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean isSort = false;

        System.out.print("Enter i = ");
        int line = input.nextInt();

        System.out.print("Enter j = ");
        int column = input.nextInt();

        int[][] array = new int[line][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i][j + 1]) {

                    int res = array[i][j];
                    array[i][j] = array[i][j + 1];
                    array[i][j + 1] = res;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

