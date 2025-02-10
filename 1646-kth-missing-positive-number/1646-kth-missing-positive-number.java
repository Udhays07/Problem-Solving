class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] result = new int[k];
        int i = 0, j = 0, a = 1;
        while(k != 0){
            if(i != arr.length && a == arr[i]){
                a++;
                i++;
            }
            else{
                result[j] = a;
                a++;
                k--;
                j++;
            }
        }
        return result[j-1];
    }
}