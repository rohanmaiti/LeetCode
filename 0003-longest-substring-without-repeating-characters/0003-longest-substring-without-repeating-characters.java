// class Solution {
//     public int lengthOfLongestSubstring(String s) {
        // int ans = 0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set = new  HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(!set.contains(s.charAt(j))){
        //             set.add(s.charAt(j));
        //             ans = Math.max(ans, (j)-i+1);
        //         }
        //         else{
        //             ans = Math.max(ans, (j-1)-i+1);
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // int n = s.length();
        // HashSet<Character> set = new HashSet<>();
        // int i=0;
        // int j=0;
        // int ans = 0;
        // while(j<n){
        //     if(!set.contains(s.charAt(j))){
        //         set.add(s.charAt(j));
        //     }else{
        //         while(s.charAt(i)!=s.charAt(j)){
        //             set.remove(s.charAt(i));
        //             i++;
        //         }
        //         set.remove(s.charAt(i));
        //          set.add(s.charAt(j));
        //         i++;
        //     }

        //     ans = Math.max(ans, j-i+1);
        //     j++;
        // }
        // return ans;

        
//     }
// }

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