class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> result = new ArrayList<>();
        String[] words = text.split(" ");
        for(int i=0; i<words.length; i++) {
            if(i+2 < words.length && words[i].equals(first) && words[i+1].equals(second)){
                result.add(words[i+2]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}