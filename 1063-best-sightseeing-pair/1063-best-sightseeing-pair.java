class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = 0; // Stores the maximum sightseeing pair score
        int maxIValue = values[0]; // Keeps track of the max (values[i] + i)

        for (int j = 1; j < values.length; j++) {
            // Compute the best score using maxIValue and the current values[j] - j
            maxScore = Math.max(maxScore, maxIValue + values[j] - j);

            // Update maxIValue for the next iteration
            maxIValue = Math.max(maxIValue, values[j] + j);
        }

        return maxScore;
    }
}
