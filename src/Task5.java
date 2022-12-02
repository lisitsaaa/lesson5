import java.util.Random;
import java.util.Scanner;

public class Task5 {
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

        int[][] array = new int[line][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print("diagonal [" + i + "] -> " + array[i][j]);
                }
            }
            System.out.println();
        }

    }
}
