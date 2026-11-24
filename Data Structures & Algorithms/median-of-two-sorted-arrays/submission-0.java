class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] A = nums1;
        int[] B = nums2;
        int total = A.length + B.length;
        int half = (total+1)/2;

        if(B.length < A.length){
            int[] temp = A;
            A=B;
            B=temp;
        }

        int l = 0;
        int r = A.length;
        while(l <= r){
            int i = (l+r)/2;
            int j = half-i;

            int l1 = i > 0 ? A[i-1]:Integer.MIN_VALUE;
            int r1 = i < A.length ? A[i] : Integer.MAX_VALUE;
            int l2 = j > 0 ? B[j-1] : Integer.MIN_VALUE;
            int r2 = j < B.length ? B[j] : Integer.MAX_VALUE;

        if(l1 <= r2 && l2 <= r1 ){
            if(total % 2 != 0){
                return Math.max(l1, l2);
            }
            return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
        }else if (l1>r2){
            r=i-1;
        }else{
            l=i+1;
        }
        }
        return -1;
    }
}
