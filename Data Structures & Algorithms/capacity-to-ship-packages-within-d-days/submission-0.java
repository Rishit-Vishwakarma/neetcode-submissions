class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lower = 0;
        int higher = 0;
        int ans = 0;

        for(int i:weights){
            lower = Math.max(lower, i);
            higher += i;
        }

        while(lower <= higher){
            int mid = lower + (higher - lower)/2;

            if(canShip(weights, days, mid)){
                higher = mid -1;
                ans = mid;
            }else{
                lower = mid+1;
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int days, int mid){
        int day = 1;
        int countWeight = 0;

        for(int i:weights){
            countWeight += i;

            if(countWeight > mid){
                countWeight = i;
                day++;
            }

            if(day > days){
                return false;
            }
        }
        return true;
    }
}