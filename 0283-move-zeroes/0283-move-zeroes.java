class Solution {
    void swap(int i,int j,int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
       
        int zeroIndex = -1;
        for(int x=0;x<nums.length;x++){
            if(nums[x] == 0)
            {
                zeroIndex = x;
                break;
            }
        }
        if(zeroIndex == -1 || zeroIndex == nums.length -1){
            return ;
        }
        int i = zeroIndex;
        int j = i+1;

        while(j<nums.length){
            // if the jth ele is a non zero ele then swap and move i and j by 1
            if(nums[j] != 0){
            swap(i,j,nums);
            i++;
            j++;
            }
            // else move j by 1
            else{
                j++;
            }
        }
    }
}