package day4;

public class TransposeMatrix {
	
	 static int[][] transpose(int a[][]){
		 
		 int r=a.length;
		 int c=a[0].length;
		 
		 int[][] trans=new int[r][c];
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				 
				 trans[j][i]=a[i][j];
				 
			 }
		 }
		 return trans;
	 }
	public static void main(String[] args) {
		 int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] transposeMatrix = transpose(matrix);

	        // Printing the transpose matrix
	        for (int i = 0; i < transposeMatrix.length; i++) {
	            for (int j = 0; j < transposeMatrix[0].length; j++) {
	                System.out.print(transposeMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    
		
	}

}
