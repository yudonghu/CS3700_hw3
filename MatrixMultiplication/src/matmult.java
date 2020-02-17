
public class matmult implements Runnable{
	
	static float[][] matmult(float[][] a, float[][] b,  int a_row, int a_col,int b_col){
		float[][] c = new float[a_row][b_col];
		
		for(int i = 0; i < a_row; i++) {
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
		return c;
	}
	
	
	
	
	public void run() {
		
		
	}
}
