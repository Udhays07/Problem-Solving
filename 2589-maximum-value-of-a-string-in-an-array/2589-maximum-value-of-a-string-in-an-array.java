class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i=0; i<strs.length; i++){
            int alphacount = 0;
            int num = 0;
            for(int j=0; j<strs[i].length(); j++){
                if(strs[i].charAt(j) >= 'A' && strs[i].charAt(j) <= 'z' ){
                    alphacount++;
                }
                if(strs[i].charAt(j) >= '0' && strs[i].charAt(j) <= '9'){
                    num++;
                }
            }
            if(alphacount != 0) alphacount += num;
            if(alphacount == 0) alphacount = Integer.parseInt(strs[i]);
            max = Math.max(max, alphacount);
        }
        return max;
    }
}