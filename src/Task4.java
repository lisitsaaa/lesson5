public class Task4 {
    public static void main(String[] args) {
        int res = 0;
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                res += array[i][j];
            }
        }
        System.out.println(res);
    }


}
