class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        for(int i=0; i<31; i++){
            int temp = (int) Math.pow(2, i);
            if(temp == n) return true;
        }
        return false;
    }
}