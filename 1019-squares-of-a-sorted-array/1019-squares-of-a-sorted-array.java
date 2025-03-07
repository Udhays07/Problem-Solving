class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l <= r){
            nums[l] *= nums[l];
            if(l != r) nums[r] *= nums[r];
            l++; r--;
        }
        Arrays.sort(nums);
        return nums;
    }
}