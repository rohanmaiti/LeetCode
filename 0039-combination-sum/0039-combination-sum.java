import java.util.*;
class Solution {
    Set <List<Integer>> s = new HashSet<>();
    public void sol(int arr[], int idx, int t, List<Integer> l, List<List<Integer>> result){
        if(idx == arr.length){
            return;
        }
        if(t < 0) {
            return;
        }
        if(t == 0){
            if(!s.contains(l)){
            result.add(new ArrayList<>(l));
            s.add(new ArrayList<>(l));
            }

            return;
        }

        l.add(arr[idx]);
        sol(arr,idx+1, t-arr[idx], l, result);
        sol(arr,idx, t-arr[idx], l, result);
        l.remove(l.size()-1);
        sol(arr,idx+1, t, l, result);

        
    }
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        sol(arr, 0, t, l, result);
        return result;
    }
}