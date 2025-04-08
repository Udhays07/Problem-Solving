class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int mid = arr[(arr.length - 1) / 2];
        int left = 0, right = arr.length - 1, index = 0;
        int[] result = new int[k];
        
        while(index < k) {
            if(mid - arr[left] > arr[right] - mid) {
                result[index++] = arr[left++];
            }else{
                result[index++] = arr[right--];
            }
            // index++; left++; right--;
        }
        return result;
    }
}