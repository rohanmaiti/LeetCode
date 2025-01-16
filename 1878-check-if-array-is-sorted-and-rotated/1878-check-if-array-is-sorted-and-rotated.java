class Solution {
    public boolean check(int[] nums) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        // [3,4,5,1,1,2,3]
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
                minIndex = i;
            }
        }
        // if(minIndex == 0){
        //     for(int i=0;i<nums.length-1;i++)
        //     if(nums[i]>nums[i+1]) return false;
        //     return true;
        // }
        // ArrayList<Integer> temp = new ArrayList<>();
        // for(int i=minIndex;i<nums.length;i++){
        //     temp.add(nums[i]);
        // }
        // ArrayList<Integer> temp2 = new ArrayList<>();
        // for(int i=0;i<minIndex;i++){
        //     temp2.add(nums[i]);
        // }
        // temp.addAll(temp2);
        // for(int i=0;i<temp.size()-1;i++){
        //     if(temp.get(i) > temp.get(i+1)) return false;
        // }
        // return true;


        if(minIndex == 0){
            for(int i=0;i<nums.length-1;i++)
            if(nums[i]>nums[i+1]){
                // if(nums[0] != nums[i+1])
                // return false;
                // if nums[0] != nums[i+1]
                // check the remaining elements are same or not
                int j = i+1; 
                while(j<nums.length){
                    if(nums[j] != nums[0]) return false;
                    j++;
                }
                break;
            } 


            return true;
        }
        else if(minIndex != nums.length - 1){
            int max = min;
            for(int i=minIndex;i<nums.length-1;i++){
                if(nums[i] > nums[i+1]) return false;
                else{
                    if(nums[i+1]>max) max = nums[i+1];
                }
            }
            if(nums[0] < max) return false;
            for(int i=0;i<minIndex-1;i++){
                if(nums[i] > nums[i+1]) return false;
            }
            return true;
        }
        else {
            if(nums[0] < nums[nums.length-1])
            return false;
            for(int i=0;i<minIndex-1;i++){
                if(nums[i]>nums[i+1]) return false;
            }
            return true;
        }

    }
}