class Solution {
    public int[][] merge(int[][] intervals) {

        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            for (int j = i + 1; j < intervals.length; j++) {
                if (end >= intervals[j][0]) {
                    end = Math.max(end, intervals[j][1]);
                    if(end == intervals[j][1]) i++; // since we already checked and confirmed that interval
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        int[][] merger = new int[ans.size()][2];
        for(int i=0; i<ans.size(); i++){
            merger[i][0] = ans.get(i).get(0);
            merger[i][1] = ans.get(i).get(1);
        }
        return merger;
    }
}