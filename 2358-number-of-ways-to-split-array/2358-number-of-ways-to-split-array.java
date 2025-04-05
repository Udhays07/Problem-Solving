class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long sumTotal = 0, sumCurr = 0;
        for(int i : nums) sumTotal += i;
        for(int i=0; i<nums.length-1; i++) {
            sumCurr += nums[i];
            if(sumCurr >= sumTotal - sumCurr) count++;
        }
        return count;
    }
}