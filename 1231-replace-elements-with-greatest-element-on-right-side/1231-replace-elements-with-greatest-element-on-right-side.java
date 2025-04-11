class Solution {
    public int[] replaceElements(int[] arr) {
        // int[] result = new int[arr.length];
        // result[arr.length -1] = - 1;
        // for(int i=0; i<arr.length-1; i++) {
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i+1; j<arr.length; j++) {
        //         max = Math.max(max, arr[j]);
        //     }
        //     result[i] = max;
        // }
        // return result;

        int max = -1;
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }else{
                arr[i] = max;
            }
        }
        return arr;
    }
}