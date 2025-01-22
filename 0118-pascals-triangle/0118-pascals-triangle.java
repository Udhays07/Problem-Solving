class Solution {
    public List<List<Integer>> generate(int n){
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> currentlist = new ArrayList<>();
            List<Integer> previouslist = new ArrayList<>();
             if(!triangle.isEmpty()){
                previouslist = triangle.get(i-1);
             }
            for(int j = 0; j<= i; j++){
                if(j == 0 || j == (i)){
                    currentlist.add(1);
                }else{
                    currentlist.add(previouslist.get(j-1) + previouslist.get(j));
                }
            }
            triangle.add(currentlist);
        }
        return triangle;
    }
}