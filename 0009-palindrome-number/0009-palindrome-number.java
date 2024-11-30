class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String s = String.valueOf(x);
        String s1 = String.valueOf(x);

        if(s.equals(new StringBuffer(s1).reverse().toString()))
        return true;
        else 
        return false;
    }
}