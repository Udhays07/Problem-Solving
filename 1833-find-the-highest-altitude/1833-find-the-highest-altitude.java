class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int highestAlt = 0;
        for(int i=0; i<gain.length; i++){
            altitude += gain[i];
            highestAlt = Math.max(highestAlt, altitude);
        }
        return highestAlt;
    }
}