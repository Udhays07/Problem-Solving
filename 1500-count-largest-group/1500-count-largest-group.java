class Solution {
    public int countLargestGroup(int n) {
        if(n < 10) return n;
        int maxCount = 0;
        int[] arr = new int[n];
        for(int i=1; i<=n; i++) {
            int temp = i, sum = 0;
            while(temp != 0) {
                sum += (temp%10);
                temp /= 10;
            }
            arr[sum]++;
        }
        Arrays.sort(arr);
        int i = n-1;
        while(arr[n-1] == arr[i]) {
            maxCount++; i--;
        }
        return maxCount;
    }
}