class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        char[] char2 = s2.toCharArray();
        char[] char1 = s1.toCharArray();
        int len = char2.length-char1.length;
        

        Arrays.sort(char1);

        for(int i=0; i<=len; i++){

            char[] char3 = new char[s1.length()];
        

            for(int j=0; j<s1.length(); j++){
                char3[j] = char2[i+j];
            }
            Arrays.sort(char3);
            if(Arrays.equals(char1, char3)){
                return true;
            }
        }
        return false;
    }
}
