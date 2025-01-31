class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        int[] frequency = new int[27];
        for(int i=0; i<sentence.length(); i++){
            frequency[sentence.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(frequency[i] == 0) return false;
        }
        return true;
    }
}