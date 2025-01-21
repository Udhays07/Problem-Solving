class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int[] leftsmall = new int[n];
        int[] rightsmall = new int[n];

        for(int i=0; i<n; i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()) leftsmall[i] = 0;
            else leftsmall[i] = s.peek() + 1;
            s.push(i);
        }

        while(!s.isEmpty()) s.pop();

        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            if(s.isEmpty()) rightsmall[i] = n-1;
            else rightsmall[i] = s.peek() - 1;
            s.push(i);
        }

        for(int i =0; i<n; i++){
            area = Math.max(area, heights[i]*(rightsmall[i] - leftsmall[i] + 1));
        }
        return area;
    }
}