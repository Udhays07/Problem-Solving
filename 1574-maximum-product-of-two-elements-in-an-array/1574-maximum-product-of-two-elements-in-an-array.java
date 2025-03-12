class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int max1 = max;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= max){
                max1 = max;
                max = nums[i];
            }else if(nums[i]>=max1 && nums[i]<=max) max1 = nums[i];
        }
        return (max-1)*(max1-1);
    }
}