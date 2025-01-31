class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int n = nums.length, count=0;
        // // Map<Integer, Integer> hm = new HashMap<>();
        // // for(int i=0; i<n; i++)
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i] == nums[j])
        //             count++;
        //     }
        // }
        // return count;
         int[] count = new int[102];
         for (int num : nums) {
            count[num]++;
        }
        int totalCount = 0;
        // Caclulate total number of pairs possible
         for (int i : count) {
            totalCount += ((i) * (i-1))/2;
        }
        return totalCount;   
    }
}