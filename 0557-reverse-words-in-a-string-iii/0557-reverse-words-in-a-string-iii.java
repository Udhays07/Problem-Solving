class Solution {
    public String reverseWords(String s) {
        String[] result = s.split(" ");
        for(int i=0; i<result.length; i++){
            char[] arr = result[i].toCharArray();
            int l = 0, r = result[i].length()-1;
            while(l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp; 
                l++; r--;
            }
            result[i] = new String(arr);
        }
        return String.join(" ", result);
    }
}