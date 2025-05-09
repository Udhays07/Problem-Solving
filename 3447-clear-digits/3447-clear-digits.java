class Solution {
    public String clearDigits(String s) {
        StringBuffer sb = new StringBuffer();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                sb.deleteCharAt(sb.length() - 1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}