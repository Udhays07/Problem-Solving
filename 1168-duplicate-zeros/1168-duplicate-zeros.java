class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr1 = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr1.length; i++) {
            if(arr[index] == 0 && i+1 < arr1.length) {
                arr1[i] = 0;
                arr1[i+1] = 0;
                i++;
            }
            else if(arr[index] != 0) {
                arr1[i] = arr[index]; 
            }
            index++;
        }
        index = 0;
        for(int i : arr1) {
            arr[index] = i;
            index++;
        }
    }
}