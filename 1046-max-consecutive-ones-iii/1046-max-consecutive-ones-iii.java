class Solution {
    public int longestOnes(int[] nums, int k) {
        int kCount = k;
         int i = 0;
         int j = 0;
         int ans = 0;
         while(j<nums.length){
            if(nums[j] == 0){
                kCount--;
            }
            while(kCount < 0){
                if(nums[i] == 0)
                kCount++;
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
         }
         return ans;
    }
}