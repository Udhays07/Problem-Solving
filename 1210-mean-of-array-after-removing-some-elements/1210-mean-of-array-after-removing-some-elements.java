class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int i = (arr.length / 10) / 2;
        double ans = 0;
        for(int index = i ; index<arr.length-i; index++) {
            ans += arr[index];
        }
        System.out.println(ans);
        return ans/(arr.length - (i*2));
    }
}