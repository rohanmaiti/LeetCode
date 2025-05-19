class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String arr[] = str.split("\\s+");
        return arr[arr.length-1].length();
    }
}