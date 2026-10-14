class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l=0;
        int count =0;
        int max = 0;

        for(int i=0; i<s.length(); i++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(l));
                l++;
                count--;     
            }                
            
            charSet.add(s.charAt(i));
            count++;
            max = Math.max(max, count);
        }
        return max;
    }
}
