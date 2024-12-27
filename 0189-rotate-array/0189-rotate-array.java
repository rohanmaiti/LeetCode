class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int K;
        // if(size > k){
        //     K = k;
        // }
        // else{
            K = k%size; // no of element to be pickedup to temp
        // }
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=size-K;i<size;i++){
            l.add(nums[i]);
        }
        for(int index = size-K-1;index>=0;index--) {
            nums[index+K] = nums[index];
        }
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            nums[i] = l.get(i);
        }
    }
}