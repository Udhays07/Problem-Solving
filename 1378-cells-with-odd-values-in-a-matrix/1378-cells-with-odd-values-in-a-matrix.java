class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int odd = 0;
        int[][] matrix = new int[m][n];
        for(int i = 0; i<indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j=0; j<matrix[r].length; j++){
                matrix[r][j]++;
                if(matrix[r][j] % 2 == 0 && odd > 0) odd--;
                else odd++;
            }
            for(int k=0; k<matrix.length; k++){
                matrix[k][c]++;
                if(matrix[k][c] % 2 == 0 && odd > 0) odd--;
                else odd++;
            }
        }
        return odd;
    }
}