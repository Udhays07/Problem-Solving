class Solution {
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public boolean isGoodArray(int[] nums) {
        if(nums[0] == 1) return true;
        int gcd = nums[0];

        for(int i=1; i<nums.length; i++){
            gcd = gcd(gcd, nums[i]);
            if(gcd == 1) return true;
        }

        return false;
    }
}