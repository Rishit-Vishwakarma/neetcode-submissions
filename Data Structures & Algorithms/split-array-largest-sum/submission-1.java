class Solution {
    public int splitArray(int[] arr, int k) {
        int high = 0;
        int low = 0;

        for(int i : arr){
            high += i;
            low = Math.max(low, i);
        }

        int ans = 0;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(isSplit(arr, k, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }        

        return ans;
    }

    public Boolean isSplit(int arr[], int k, int mid){
        int count =1;
        int sum =0;

        for(int i : arr){
            sum += i;

            if(sum > mid){
                count++;
                sum = i;
            }
        }

        if(count > k){
            return false;
        }
        return true;
    }
}