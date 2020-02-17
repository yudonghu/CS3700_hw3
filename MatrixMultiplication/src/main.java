
public class main {
	
	public static void main(String args[]) {
		
		int a_row = 5;
		int a_col = 10;
		float [][] a = new float[a_row][a_col];
		fillMatrixWith2point5(a);
		printMatrix(a);
		int b_row = 10;
		int b_col = 5;
		float [][] b = new float[b_row][b_col];
		fillMatrixWith2point5(b);
		printMatrix(b);
		matmult.matmult(a,b,a_row,a_col,b_col);
		
		

		System.out.println(a.length +" "+a[0].length+" "+b.length); 
        
		
		
		
        float[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        float[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
        int a_r = firstMatrix.length; 
        int a_c = firstMatrix[0].length;
        int b_r = secondMatrix.length;
        int b_c = secondMatrix[0].length;

		System.out.println(a_r+" "+a_c+" "+b_c); 
        
        
        matmult.matmult(firstMatrix,secondMatrix,a_r,a_c,b_c);
        
        
	}

	public static void fillMatrixWith2point5(float a[][]) {
		for (int i = 0 ; i < a.length ; i++) {
			for (int j = 0 ; j < a[0].length; j++) {
				a[i][j] = (float) 3;
			}
		}
	}
	public static void printMatrix(float a[][]) {
		for (int i = 0 ; i < a.length ; i++) {
			for (int j = 0 ; j < a[0].length; j++) {
				System.out.print(a[i][j]+" "); 
			}
			System.out.println(); 
			
		}
	}
}
