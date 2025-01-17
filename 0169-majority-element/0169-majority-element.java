class Solution {
    public int majorityElement(int[] nums) {
       // approach-01 || brute
       // count frequency and return the max frequency elements 
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);

        for(int key : m.keySet()){
            int s = m.get(key);
            if(s > nums.length / 2){
                return key;
            }
        }
        return -1;

       // complete in lenear time and o(1) space 
       // [2,2,1,1,1,2,2]
       // moore's algo 
    }
}