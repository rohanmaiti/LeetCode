class Solution {
    public boolean isValid(String s) {
        Stack <Character> stk = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == '{'){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == '['){
                 stk.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stk.isEmpty() || stk.peek() != '(')
                return false;
                if(stk.peek() == '(')
                stk.pop();
            }
            else if(s.charAt(i) == '}'){
                if(stk.isEmpty() || stk.peek() != '{')
                return false;
                if(stk.peek() == '{')
                stk.pop();
            }
            else if(s.charAt(i) == ']'){
                 if(stk.isEmpty() || stk.peek() != '[')
                return false;
                 if(stk.peek() == '[')
                stk.pop();
            }
            i++;
        }
        if(stk.isEmpty())
        return true;
        else return false;
    }
}