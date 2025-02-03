class Solution {
    public int[] sumZero(int n) {
        int sum = 0;
        int[] nums = new int[n];
        if(n == 2){
            nums[0] = 1;
            nums[1] = -1;
            return nums;   
        }
        for(int i=0; i<n-1; i++){
            nums[i] = i;
            sum += i;
        }
        nums[n-1] = (-sum);
        return nums;
    }
}