class Solution {
    public void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sol(int nums[], int idx,  List<List<Integer>> result){
        if(idx == nums.length){
            // result here
            List <Integer> l = new ArrayList<>();
            for(var ele: nums)
            l.add(ele);
            result.add(new ArrayList<>(l));
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums, i, idx);
            sol(nums, idx+1, result);
            swap(nums, i, idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sol(nums, 0, result);
        return result;
    }
}