class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> m = new HashMap<>();
        char arr[] = s.toCharArray();
        int i=0;
        int j = 0;
        int maxFreq = 0;
        int ans = 0;
        while(j < arr.length){
           m.put(arr[j],m.getOrDefault(arr[j],0)+1);
           maxFreq = Math.max(maxFreq, m.get(arr[j]));
           if(((j-i+1 )- maxFreq) > k){
            maxFreq = 0;
            m.put(arr[i],m.get(arr[i])-1);
            if(m.get(arr[i]) == 0){
                m.remove(arr[i]);
            }
            // for(var key : m.keySet()){
            //     if(m.get(key) > maxFreq)
            //     maxFreq = m.get(key);
            // }
            i++;
           }
           ans = Math.max(ans, j-i+1);
           j++;
        }
        return ans;
    }
}