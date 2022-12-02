import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][][] thirdArray = new int[][][]{
                {{1, 2}, {3, 4}, {5, 6}},
                {{7, 8}, {9, 10}, {11, 12}}
        };

        System.out.println(Arrays.deepToString(thirdArray));

        System.out.print("Enter a number for count with elements: ");

        while (!input.hasNextInt()) {
            System.out.println("you need to enter a number!!! try again :)");
            input.nextLine();
        }

        int answer = input.nextInt();

        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = 0; j < thirdArray[i].length; j++) {
                for (int k = 0; k < thirdArray[i][j].length; k++) {
                    thirdArray[i][j][k] += answer;
                }
            }
        }
        System.out.println("update the array: "+Arrays.deepToString(thirdArray));
    }
}
