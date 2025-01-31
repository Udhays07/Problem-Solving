class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        int a = 0;
        for(int i=0; i<n; i++){
            answer[a] = nums[i];
            a += 2;
        }
        a = 1;
        for(int i = n; i<2*n; i++){
            answer[a] = nums[i];
            a += 2; 
        }
        return answer;
    }
}