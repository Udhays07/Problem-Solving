class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = grid.length * grid[0].length;
        k %= (n);
        int[] temp = new int[2 * n];
        int index = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                temp[index] = grid[i][j];
                index++;
            }
        }
        index = n-k;
        System.arraycopy(temp, 0, temp, n, n);
        for(int i=0; i<grid.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<grid[0].length; j++) {
                list.add(temp[index]);
                index++;
            }
            result.add(list);
        }
        return result;
    }
}