class Solution {
      public void sol(int []nums, int i, int n, List<Integer> current, List<List<Integer>> result){
        if(i == n){
            result.add(new ArrayList<>(current));
            return;
        }
       
        // include
        current.add(nums[i]);
        sol(nums, i+1, n, current, result);
        // exclude
        // setting index 
        int index = i;
        while(index < n && nums[i] == nums[index]) index++;
        current.remove(current.size()-1);
        sol(nums, index, n, current, result);
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sol(nums, 0, nums.length, list, result);
        return result;
    }
}