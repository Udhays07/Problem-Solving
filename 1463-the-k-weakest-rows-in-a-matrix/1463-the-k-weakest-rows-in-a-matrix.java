class Solution {
    public int[] kWeakestRows(int[][] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 1){
                    count++;
                }
                else break;
            }
            map.put(i, count);
        }
        System.out.println(map);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
        
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = list.get(i).getKey();
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}