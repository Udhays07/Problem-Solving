class Solution {
    public boolean halvesAreAlike(String s) {
        int a = 0;
        int b = 0;
        int n = s.length();
        s = s.toLowerCase();
        for(int i=0; i<n; i++){
            if(i < n/2){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') a++;
            }
            if(i >= n/2){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') b++;
            }   
        }
        System.out.print(b);
        if(a == b) return true;
        return false;
    }
}