class Solution {
    public List<List<Integer>> generate(int r) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l = new ArrayList<>(List.of(1));
        result.add(new ArrayList<>(l));
        if(r == 1) return result;
        l = new ArrayList<>(List.of(1,1));
        result.add(new ArrayList<>(l));
        if(r == 2) return result;
        
        for(int i=2;i<r;i++){
            List<Integer> prev = result.get(i-1);
            int x = 0;
            int y = 1;
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i)
                list.add(1);
                else{
                    int sum = prev.get(x) + prev.get(y);
                    x++; y++;
                    list.add(sum);
                }
            }
            result.add(new ArrayList<>(list));
        }

        return result;
        
    }
}