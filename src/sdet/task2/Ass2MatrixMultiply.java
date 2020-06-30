package sdet.task2;
public class Ass2MatrixMultiply {

    public static void main(String[] args) {
        int row1 = 2, column1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };

        // Mutliplying Two matrices
        int[][] multi = new int[row1][c2];
        for(int i = 0; i < row1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < column1; k++) {
                	multi[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiply of two matrices is: ");
        for(int[] row : multi) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}