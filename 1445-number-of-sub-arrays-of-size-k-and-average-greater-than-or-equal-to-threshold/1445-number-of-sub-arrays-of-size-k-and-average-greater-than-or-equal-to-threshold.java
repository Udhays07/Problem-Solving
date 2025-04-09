class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        for(int i=0; i<=arr.length - k; i++) {
            int avg = 0, temp = k, j = i;
           while(temp != 0) {
            avg += arr[j];
            j++; temp--;
           }
           avg = avg/k;
           if(avg >= threshold) count++;
        }
        return count;
    }
}