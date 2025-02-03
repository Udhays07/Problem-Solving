class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0, j=n-1; i<n && j>=0; i++, j--){
            sum += (mat[i][i] + mat[j][i]);
        }
        if(n % 2 != 0){
            sum = sum - (mat[n/2][n/2]);
        }
        return sum;
    }
}