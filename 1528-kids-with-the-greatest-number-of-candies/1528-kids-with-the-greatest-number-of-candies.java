class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> answer = new LinkedList<>();
        for(int i=0; i<candies.length; i++){
            if(max < candies[i]) max = candies[i];
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= max){
                answer.add(true);
            }
            else{
                answer.add(false);
            }
        }
        return answer;
    }
}