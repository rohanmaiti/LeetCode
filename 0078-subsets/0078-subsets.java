class Solution {
    public void sol(int nums[], List<Integer> l, int idx, List<List<Integer>> result){
        if(idx == nums.length){
            result.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[idx]);
        sol(nums, l, idx+1, result);
        l.remove(l.size()-1);
        sol(nums, l, idx+1, result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        sol(nums, l, 0, result);
        return result;
    }
}