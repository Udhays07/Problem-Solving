class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int count = -1;
        int x = 1;
        while(x <= n){
            int temp = 0;
            for(int i=0; i<n; i++){
                if(nums[i] >= x && temp <= x){
                    temp++;
                }
            }
            if(x == temp){
                return temp;
            }else x++;
        }
        return count;
    }
}