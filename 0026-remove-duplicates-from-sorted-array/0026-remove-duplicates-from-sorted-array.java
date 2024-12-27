class Solution {
    public int removeDuplicates(int[] arr) {
        int size = arr.length;
        if(size == 1){
            return 1;
        }
        int i = 0;
        int j = 1;
        while(j<size){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                arr[i+1]= arr[j];
                i++;
                j++;
            }

        }

        return i+1;
    }
}