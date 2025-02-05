class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        if(s1.equals(s2)) return true;
        int i=-1; 
        int j=-1;
        int count = 0;
        for(int index=0; index<s1.length(); index++){
            char c1 = s1.charAt(index);
            char c2 = s2.charAt(index);
            if(c1 != c2){
                count++;
                if(count == 1) i = index;
                else if(count == 2) j = index;
            }
            if(count > 2) return false;
        }
        if(count == 1) return false;
        if(s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)) return true;
        else return false;
    }
}