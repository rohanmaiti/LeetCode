class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      // 0 0 0 0 0 1 1 1 1 0 1 0 1 1 1 1 1  0 
      // i = 0 and j = 0;
      // if(j == 0) i = j+1; j++;
      // else j++;
      
      int i = 0,j=0;
      int maxLength = 0;
      for(j=0;j<nums.length;   ) {
            if(nums[j] == 0 ){
                int l = j-1 - i + 1; 
                maxLength = Math.max(maxLength , l);
                i = j+1;
                j++;
            }
            else{
                j++;
            }
      }
        int l = j-1 - i +  1; 
        maxLength = Math.max(maxLength , l);

      return maxLength;
    }
}