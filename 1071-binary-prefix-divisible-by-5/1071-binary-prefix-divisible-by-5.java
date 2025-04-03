class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int num = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i : nums){
            num = (num*2+i) % 5;
            result.add(num == 0);
        }
        return result;
    }
}