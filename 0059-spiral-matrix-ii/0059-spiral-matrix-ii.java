class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0, left = 0, bottom = n-1, right = n-1;
        int num = 1;
        while(left <= right){
            for(int i=left; i<=right;i++){
                result[top][i] = num;
                num++;
            }
            top++;
            for(int i=top; i<=bottom; i++){
                result[i][right] = num;
                num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result[bottom][i] = num;
                    num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result[i][left] = num;
                    num++;
                    
                }
                left++;
            }
        }
        return result;
    }
}