class Solution {
    public void swap(int []nums, int idx, int i){
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }
    public void sol(int []nums, int idx, int n, List<List<Integer>> result){
        if(idx == n){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++)
            l.add(nums[i]);
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<n;i++){
            swap(nums,i,idx);
            sol(nums,idx+1,n,result);
            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sol(nums, 0, nums.length, result);
        return result;
    }
}