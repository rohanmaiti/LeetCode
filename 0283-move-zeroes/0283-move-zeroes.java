class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        for(int i=size-1;i>=0;i--){
            if(nums[i]==0 && i != size-1){
                int j = i;
                while(j<size-1 && nums[j+1] != 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    j++;
                }
            }
        }
    }
}