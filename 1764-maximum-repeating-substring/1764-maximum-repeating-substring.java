class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        // int num = 0, j = 0, i = 0;
        //     while(i < sequence.length()){
        //         if(j < word.length() && sequence.charAt(i) == word.charAt(j)){
        //             j++; i++; 
        //             num++;
        //         }
        //         else {
        //             j = 0; 
        //             if(num > 0) {
        //                 i = i-num+1;
        //             }else i++;
        //             num = 0;
        //         }
        //         if(num == word.length()){
        //             count++;
        //             num = 0; j = 0;
        //             System.out.println(i);
        //         }
        //     }
        StringBuilder sb = new StringBuilder(word);

        while(sequence.contains(sb.toString())) {
            count++;
            sb.append(word);
        }
        System.out.print(sb.toString());
        return count;
    }
}