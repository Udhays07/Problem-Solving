class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float median = 0;
        int n = nums1.length + nums2.length;
        float[] num3 = new float[n];
        int i = 0;
        for(i=0; i<nums1.length; i++){
            num3[i] = nums1[i];
        }
        for(int j=0; j < nums2.length; j++){
            num3[i++] = nums2[j];
        }
        Arrays.sort(num3);
        if(n%2 == 1){
            median = num3[n/2];
        }else{
            n = n/2;
            median = (num3[n-1] + num3[n])/2;
        }
        return median;
    }
}