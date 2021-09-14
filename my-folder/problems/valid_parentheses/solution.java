class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '('){
                valid.push(')');
            }
            else if(c == '{'){
                valid.push('}');
            }
            else if(c == '['){
                valid.push(']');
            }
            else if(valid.isEmpty() || valid.pop()!= c ){   
                return false;
        }
        }
            return valid.isEmpty();
        
    }
}