class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        Arrays.sort(arr);
        int[] freq = new int[1001];
        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for(int i=0; i < target.length; i++) {
            if(freq[target[i]] <= 0) return false;
            freq[target[i]]--;
        }
        return true;
    }
}