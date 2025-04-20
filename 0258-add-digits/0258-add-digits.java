class Solution {
    int sum(int num) {
        int s = 0;
        while(num != 0) {
            s = s+(num%10);
            num /= 10;
        }
        return s;
    }
    public int addDigits(int num) {
        while(num > 9) {
            num = sum(num);            
        }
        return num;
    }
}