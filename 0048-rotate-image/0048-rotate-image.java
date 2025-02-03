class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        for(int column = 0; column < n; column++){
            int i =0;
            for(int row = n-1; row >= 0; row--){
                temp[column][i++] = matrix[row][column]; 
            }
        }
        for(int column = 0; column < n; column++){
            for(int row = 0; row < n; row++){
                matrix[column][row] = temp[column][row]; 
            }
        }
    }
}