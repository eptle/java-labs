public class lab2_7 {
    public static int[] findMaxInEachRow(int[][] matrix) {
        int[] maxInRows = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxInRows[i] = max;
        }

        return maxInRows;
    }

    public static void main() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] maxInRows = findMaxInEachRow(matrix);

        System.out.print("Максимальные элементы в каждой строке: ");
        for (int max : maxInRows) {
            System.out.print(max + " ");
        }
    }
}
