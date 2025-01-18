class Solution {
    public void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] rearrangeArray(int[] nums) {
        // [3,-2,1,-5,2,-4]
        // BRUTE FORCE : 
        // ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Integer> l2  = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] > 0)
        //     l1.add(nums[i]);
        //     else 
        //     l2.add(nums[i]);
        // }
        // int x = 0;
        // int y = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(i%2 == 0)
        //     nums[i] = l1.get(x++);
        //     else
        //     nums[i] = l2.get(y++);
        // }
        // return nums;

        // OPTIMAL APPROACH
        int n = nums.length;
        int []ans = new int[n];
        int pIdx = 0;
        int nIdx = 1;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
            ans[pIdx] = nums[i];
            pIdx += 2;
            }
            else{
            ans[nIdx] = nums[i];
            nIdx += 2;
            }
        } 
        return ans;

    }
}