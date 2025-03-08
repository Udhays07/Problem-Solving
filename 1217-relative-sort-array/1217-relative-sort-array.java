class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int a = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j=0; j < arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    result[a] = arr1[j];
                    a++;
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = a; a < arr1.length; a++){
            result[a] = arr1[a];
        }
        return result;
    }
}