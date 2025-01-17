class Solution {
    public void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        // [2, 0, 2, 1, 1, 0]
        // BRUTE : sort the array 
        // BETTER : frequency count of three values and put them in array 

        // BEST : Dutch National flag algorithm. 
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(mid,high,nums);
                high--;
            }
        }
        
    }
}