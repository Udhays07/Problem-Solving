class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = Integer.MIN_VALUE;
        double temp = 0.0;
        for(int i=0; i < k; i++){
            temp += nums[i];
        }
        average = temp / k;
        for(int j = k; j < nums.length; j++){
            temp += nums[j] - nums[j-k];
            average = Math.max(average, temp/k);
        }
        return average;
    }
}