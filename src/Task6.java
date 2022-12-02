import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter i = ");
        while (!input.hasNextInt()) {
            System.out.println("you need to enter a number!!! try again :)");
            input.nextLine();
        }
        int line = input.nextInt();

        System.out.print("Enter j = ");
        while (!input.hasNextInt()) {
            System.out.println("you need to enter a number!!! try again :)");
            input.nextLine();
        }
        int column = input.nextInt();

        System.out.println();

        int[][] array = new int[line][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    if (array[i][j] < array[i][k]) {
                        int res = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = res;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

