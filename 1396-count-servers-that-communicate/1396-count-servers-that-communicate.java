class Solution {
    public int countServers(int[][] grid) {
        int count = 0;
        int[] rows = new int[grid.length];
        int[] colm = new int[grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                rows[i] += grid[i][j];
                colm[j] += grid[i][j];
            }
        }
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1 && (rows[i] > 1 || colm[j] > 1)) count++;
            }
        }
        return count;
    }
}