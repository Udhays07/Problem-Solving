class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pointer = 0, flag = 0;
        for(int i=0; i<nums.length; i++) {
            int places = 0;
            if(nums[i] == 1 && flag == 1){
                places = i - pointer;
                if(places < k) return false;
                pointer = i+1;
            }
            else if(nums[i] == 1){
                flag = 1;
                pointer = i+1;
            }
        }
        return true;
    }
}