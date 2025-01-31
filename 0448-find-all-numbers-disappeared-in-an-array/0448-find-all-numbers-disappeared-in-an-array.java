class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] frequency = new int[n+1];
        Arrays.sort(nums);
        List<Integer> answer = new LinkedList<>();
        for(int i = 0; i<n; i++){
            frequency[nums[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(frequency[i] == 0) answer.add(i);
        }
        return answer;
    }
}