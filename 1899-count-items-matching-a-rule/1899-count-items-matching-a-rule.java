class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int rule = 0;
        if(ruleKey.equals("color")) rule = 1;
        else if(ruleKey.equals("name")) rule = 2;
        for(List item: items){
            // String str = item.get(rule);
            if(item.get(rule).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}