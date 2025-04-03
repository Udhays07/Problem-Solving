class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        char[] chars = words[0].toCharArray();
        for(char c : chars) {
            int count = 0;
            String charStr = String.valueOf(c);
            for(String word : words) {
                if(word.contains(charStr)){
                    count++;
                }
            }
            if(count == words.length){
                result.add(charStr);
                for (int j = 0; j < words.length; j++) {
                    words[j] = words[j].replaceFirst(String.valueOf(c), "");
                }
            }
        }
        return result;
    }
}