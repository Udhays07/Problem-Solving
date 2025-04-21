class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] frequency = new int[26];
        for(int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            frequency[c - 'a']++;
        }
        int count = 0;
        String s = "balloon";
        int flag = 0;
        while(flag == 0) {
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(frequency[c - 'a'] == 0){
                    flag = 1;
                    break;
                }
                else{
                    frequency[c-'a']--;
                }
            }
            if(flag == 0) count++;
        }
        return count;
    }
}