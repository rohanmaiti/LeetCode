class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute agaya O(n^2)
        // [2, 7, 11, 15]
        // better using hashing 
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int remaining = target-a;
            if(m.containsKey(remaining)){
                // means other number that will complete the target is present
                int j = m.get(remaining); 
                return new int[]{j,i};
            }
            // writing here to deal with  duplicate elements
            m.put(nums[i],i);
        }  
        return new int[]{-1,-1};

    }
}