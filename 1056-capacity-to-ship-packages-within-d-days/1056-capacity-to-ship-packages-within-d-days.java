class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0;

      
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > start) {
                start = weights[i]; 
            }
            end += weights[i]; 
        }

        while (start < end) {  
            int mid = start + (end - start) / 2;

            if (helper(weights, mid, days)) {  
                end = mid;  
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean helper(int[] weights, int mid, int days) {
        int count = 1; 
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > mid) {  
                count++; 
                sum = weights[i]; 
                if (count > days) return false; // Early exit if exceeding days
            } else {
                sum += weights[i];
            }
        }
        return true; 
    }
}