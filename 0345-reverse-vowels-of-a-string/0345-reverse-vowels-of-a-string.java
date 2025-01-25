class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Character> h = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                h.push(s.charAt(i));
            }
        }
        for(int i=0; i<s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
               char a = h.pop();
               sb.setCharAt(i, a);
               System.out.print(s.charAt(i));
            }
        }
        return sb.toString();
    }
}