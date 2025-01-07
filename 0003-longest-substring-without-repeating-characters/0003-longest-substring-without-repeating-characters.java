class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        int left = 0;
        // int right = 0;
        int maxLength = 0;
        for(int right = 0; right<s.length(); right++){
            if(m.containsKey(s.charAt(right))){
                // check wheather it is less than left or not 
                if(m.get(s.charAt(right)) >= left){
                    // update left and map
                    left = m.get(s.charAt(right)) + 1;
                    m.put(s.charAt(right), right);
                }
                else{
                    m.put(s.charAt(right), right);
                }
            }
            else{
                m.put(s.charAt(right), right);
            }
            maxLength = Math.max(maxLength , (right-left+1));
        }

        return maxLength;
    }
}