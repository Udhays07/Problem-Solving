class Solution {
    public boolean judgeCircle(String moves) {
        int side = 0;
        int top = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U') side++;
            if(moves.charAt(i) == 'D') side--;
            if(moves.charAt(i) == 'L') top++;
            if(moves.charAt(i) == 'R') top--;
        }
        if(side == 0 && top == 0) return true;
        return false;
    }
}