class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        List<Integer> min = new LinkedList<>();
        List<Integer> max = new LinkedList<>();
        for(int m = 0; m<matrix.length; m++){
            int least = Integer.MAX_VALUE;
            for(int n = 0; n < matrix[0].length; n++){
                least = Math.min(least, matrix[m][n]);
            }
            min.add(least);
        }
        for(int m = 0; m<matrix[0].length; m++){
            int high = 0;
            for(int n = 0; n < matrix.length; n++){
                high = Math.max(high, matrix[n][m]);
            }
            max.add(high);
        }
        for(int i=0; i<max.size(); i++){
            int temp = max.get(i);
            if(min.contains(temp)){
                result.add(temp);
            }
        }
        return result;
    }
}