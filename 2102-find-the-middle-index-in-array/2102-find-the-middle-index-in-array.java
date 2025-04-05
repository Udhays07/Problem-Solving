class Solution {
    public int findMiddleIndex(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int l = 0, r = 0;
            for(int j=0; j<nums.length; j++) {
                if(j < i){
                    l += nums[j];
                }else if(j > i) {
                    r += nums[j];
                }
            }
            if(l == r) return i;
        }
        return -1;
    }
}