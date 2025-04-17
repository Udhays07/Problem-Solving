class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word: strs){
            char[] str = word.toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<String>());
            }
            hm.get(sorted).add(word);
        }
        for (Map.Entry<String,List<String>> entry : hm.entrySet()){
            anagrams.add(entry.getValue());
        }
        return anagrams;
    }
}