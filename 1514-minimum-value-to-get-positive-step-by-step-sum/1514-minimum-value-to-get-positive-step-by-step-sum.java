class Solution {
    public int minStartValue(int[] nums) {
        int start = 1;
        int flag = 0;
        while(flag != 1) {
            int temp = start;
            for(int i=0; i<nums.length; i++) {
                temp += nums[i];
                if(temp < 1){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                flag = 0;
                start++;
            }
            else{
                flag = 1;
            }
        }
        return start;
    }
}