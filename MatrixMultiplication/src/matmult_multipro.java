
public class matmult_multipro implements Runnable {
	static void partical_matmult(float[][] a, float[][] b, float[][] c, int a_row, int a_col,int b_col, int firstrow, int numrow){
		

		c = new float[a_row][b_col];
		
		for(int i = firstrow; i < a_row; i++) {
			for (int j = 0; j < b_col; j++) {
				for (int k = 0; k < a_col ; k++) {
					c[i][j] += a[i][k]* b[k][j];
				}
			}
		}
		for (int i = 0; i < c.length ; i++) {
			for (int j = 0; j<c[0].length; j++) {
		        System.out.print(c[i][j] + " ");
			}
		      System.out.println();
		}
	}
	
	static void matmult(float[][] a, float[][] b, float[][] c, int a_row, int a_col,int b_col){
		
		for(int i = 0 ;i < 4 ; i ++) {
			partical_matmult(a,b,c,a_row,a_col,b_col , i*a_row/4, a_row/4);
		}
		for (int i = 0; i < 4; i++) {
	           // join thread i;
		}
	}
	
	public void run() {
		
	}
	
}
