class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftMultiple = 1;
        int rightMultiple = 1;
        int zeroCount = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
         rightMultiple *= nums[i];
         if(nums[i] == 0) zeroCount++;
        }
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroCount--;
                if(zeroCount == 0){
                    rightMultiple = 1;
                    for(int j=i+1;j<nums.length;j++){
                        rightMultiple *= nums[j];
                    }
                  //  System.out.print("rightMultiple =" + rightMultiple);
                }
                else{
                    rightMultiple = 0;
                }
            }
            else{
                rightMultiple /= nums[i];
            }
            int ans = rightMultiple * leftMultiple;
            result[i] = ans;
            leftMultiple *= nums[i];

        }
        return result;
    }
}