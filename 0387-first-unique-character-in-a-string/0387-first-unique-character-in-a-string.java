class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            if(!q.isEmpty() && q.contains(s.charAt(i))){
                h.put(s.charAt(i), 2);
            }
            else{
                h.put(s.charAt(i), 1);
                q.add(s.charAt(i));
            }
        }
        while(!q.isEmpty()){
            char ch = q.poll();
            if(h.get(ch) == 1){
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}