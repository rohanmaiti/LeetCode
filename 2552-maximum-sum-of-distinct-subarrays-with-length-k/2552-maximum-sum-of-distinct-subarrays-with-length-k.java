class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        long sum = 0;
        long maxSum = 0;
        HashSet<Integer> s = new HashSet<>();
        while(j<nums.length){
            if(!s.contains(nums[j])){
                sum += nums[j];
                s.add(nums[j]);
            }else{
                while(nums[i] != nums[j]){
                    s.remove(nums[i]);
                    sum -= nums[i];
                    i++;
                }
                s.remove(nums[i]);
                sum -= nums[i];
                i++;
                continue;
            }
            if(s.size() == k){
                maxSum = Math.max(maxSum, sum);
                s.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return maxSum;
    }
}