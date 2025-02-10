class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int left = 0;
        int right = grid.length-1;
        while(left < right){
            for(int i=0; i<grid[0].length; i++){
                if(grid[left][i] < 0) count++;
                if(grid[right][i] < 0) count++;
            }
            left++;
            right--;
        }
        if(grid.length%2 != 0){
            for(int i=0; i<grid[0].length; i++){
                if(grid[right][i] < 0) count++;
            }
        }
        return count;
    }
}