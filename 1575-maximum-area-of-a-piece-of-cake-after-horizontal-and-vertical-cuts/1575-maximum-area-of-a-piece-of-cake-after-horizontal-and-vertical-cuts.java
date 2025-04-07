class Solution {
    public int maxArea(int h, int w, int[] hCuts, int[] vCuts) {
        Arrays.sort(hCuts); Arrays.sort(vCuts);

        int maxHeight = Math.max(hCuts[0] - 0, h - hCuts[hCuts.length - 1]);
        for(int i=1; i<hCuts.length; i++) {
            int diff = hCuts[i] - hCuts[i-1];
            maxHeight = Math.max(maxHeight, diff);
        }

        int maxWidth = Math.max(vCuts[0]-0 , w - vCuts[vCuts.length - 1]);
        for(int i = 1; i<vCuts.length; i++) {
            int diff = vCuts[i] - vCuts[i-1];
            maxWidth = Math.max(maxWidth, diff);
        }

        long ans = 1L * maxHeight * maxWidth;
        return (int) (ans % 1000000007);
    }
}