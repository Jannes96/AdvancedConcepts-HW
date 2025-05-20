package homework_6_task1;

import java.util.Arrays;

public class MatrixMultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3 x 2 Matrix
		int [][] firstMatrix = {
				  new int[]{1, 5},
				  new int[]{2, 3},
				  new int[]{1, 7}
				};

		// 2 x 4 Matrix
		int[][] secondMatrix = {
				  new int[]{1, 2, 3, 7},
				  new int[]{5, 2, 8, 1}
				};
		
		try {
			System.out.println(Arrays.deepToString(multiplyMatrices(firstMatrix, secondMatrix)));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
    public static int[][] multiplyMatrices(int[][] A, int[][] B) throws InterruptedException {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        
        // Es entsteht eine [(firstMatrix - row) X (secondMatrix - col] 
        int[][] result = new int[rowsA][colsB];

        // Create and start threads
   

        return result;
    }
}

