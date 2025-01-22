class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalgas = 0, totalcost = 0, startindex = 0, currentgas = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            totalgas += gas[i];
            totalcost += cost[i];
            currentgas += (gas[i] - cost[i]);
            q.add(gas[i] - cost[i]);
            while(currentgas < 0 && !q.isEmpty()){
                currentgas -= q.poll();
                startindex++;
            }
        }
        return totalgas >= totalcost ? startindex % n : -1;
    }
}