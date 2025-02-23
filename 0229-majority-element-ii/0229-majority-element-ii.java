class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=0;
        while(j < n){
            if(nums[i] == nums[j]){
                j++;
            }
            else{
                // calculate the length
                int noOfElement = j-i;
                int x = n / 3;
              
                    if(noOfElement > x){
                        result.add(nums[i]);
                    }

                i = j;
            }
        }
        int noOfElement = j-i;
        int x = n / 3;
        if(noOfElement > x){
            result.add(nums[i]);
        }

        return result;
    }
}