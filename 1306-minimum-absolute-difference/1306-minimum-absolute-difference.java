class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length - 1; i++){
            min = Math.min(min, arr[i+1] - arr[i]);
        }
        System.out.println(min);
        for(int i = 0; i<arr.length-1; i++){
            List<Integer> temp = new ArrayList<>();
            if(arr[i+1] - arr[i] == min){
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                result.add(temp);
            }
        }
        return result;
    }
}