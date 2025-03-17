class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0) return false;
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;
        while(l <= r){
            if(nums[l] != nums[l+1]) return false;
            if(nums[r] != nums[r-1]) return false;
            l += 2; r -= 2;
        }
        return true;
    }
}