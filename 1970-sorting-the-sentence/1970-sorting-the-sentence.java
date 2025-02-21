class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] result = new String[str.length];
        for(int i=0; i<str.length; i++){
            char c = str[i].charAt(str[i].length()-1);
            int n = Character.getNumericValue(c);
            str[i] = str[i].replaceAll("[0-9]", "");
            result[n-1] = str[i];
        }
        String res = String.join(" ", result);
        return res;
    }
}