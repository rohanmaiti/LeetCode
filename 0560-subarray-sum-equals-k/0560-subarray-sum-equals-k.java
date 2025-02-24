class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int prefSum = 0;
        m.put(0,1);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            prefSum += nums[i];
            if(m.containsKey(prefSum-k)){
                count += m.get(prefSum-k);
            }
            m.put(prefSum,m.getOrDefault(prefSum,0)+1);

        }
        return count;
    }
}