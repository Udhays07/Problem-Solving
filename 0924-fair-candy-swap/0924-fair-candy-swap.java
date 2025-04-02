class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;
        for(int num: aliceSizes) sumA += num;
        for(int num: bobSizes) sumB += num;

        int delta = (sumB - sumA) / 2;
        HashSet<Integer> bobSet = new HashSet<>();
        for(int num: bobSizes) bobSet.add(num);

        for(int x: aliceSizes) {
            int y = x + delta;
            if(bobSet.contains(y)) return new int[]{x, y};
        }

        return new int[0];
    }
}