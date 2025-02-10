class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int left = 1;
        int right = num/2;
        while(left < right){
            if(left*left == num || right*right == num) return true;

            left++;
            right--;
        }
        return false;
    }
}