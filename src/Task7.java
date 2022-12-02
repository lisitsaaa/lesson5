public class Task7 {
    public static void main(String[] args) {
        int[][] hourglass = new int[7][7];
        for (int i = 0; i < hourglass.length; i++) {
            for (int j = 0; j < hourglass.length; j++) {
                if (j >= i || i + j > hourglass.length - 2) {
                    hourglass[i][j] = 1;
                } else {
                    hourglass[i][j] = 0;
                }
                System.out.print(hourglass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
