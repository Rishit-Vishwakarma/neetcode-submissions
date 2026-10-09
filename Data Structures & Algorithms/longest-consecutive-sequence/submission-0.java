class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        int maximum = 0;

        for(int num:nums){
            numSet.add(num);
        }

        for(int itr : numSet){
            if(!numSet.contains(itr-1)){
                int length = 1;
                while(numSet.contains(itr+length)){
                    length++;
                }
                maximum = Math.max(maximum, length);
            }
        }
        return maximum;
    }
}
