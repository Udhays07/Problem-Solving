class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, n-1);
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i != j && nums[i] <= nums[j]){
                    arr[i]--;
                }
            }
        }
        return arr;
    }
}