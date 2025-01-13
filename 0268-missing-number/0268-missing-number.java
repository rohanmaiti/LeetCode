class Solution {
    public int missingNumber(int[] nums) {
        // approach-01
        // int n = nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     if(nums[i] != i)
        //     return i;
        // }
        // return n;

        // approach-02
        // sum of 'n' natural numbers.
        // Sn = n(n+1)/2
        int n = nums.length;
        int sum = n*(n+1) / 2 ;
        int add = 0;
        for(int i=0;i<n;i++){
            add += nums[i];
        }

        return sum - add;
    }
}