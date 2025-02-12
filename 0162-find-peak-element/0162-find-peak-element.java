class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int result = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0, j=nums.length-1; i <= j; i++, j--){
            if(max < nums[i]){
                result = i;
                max = nums[i];
            }
            if(max < nums[j]){
                result = j;
                max = nums[j];
            }
        }
        return result;
    }
}