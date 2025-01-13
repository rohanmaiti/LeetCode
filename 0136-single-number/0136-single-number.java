class Solution {
    public int singleNumber(int[] nums) {

        // Approach-01
        // Arrays.sort(nums);
        // if(nums.length == 1) return nums[0];

        // for(int i=0;i<nums.length-1; i += 2){
        // if(nums[i] != nums[i+1])
        // return nums[i];
        // }
        // return nums[nums.length - 1];


        // Approach-02
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}