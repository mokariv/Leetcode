class Solution {
    public String minRemoveToMakeValid(String s) {
    int open=0;
    StringBuilder str = new StringBuilder();
        for(char a : s.toCharArray()){
            if(a == '('){
                open++;
            }
            else if(a == ')'){
                if(open == 0) continue;
                open--;
            }
            str.append(a);
            }
        StringBuilder result = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == '(' && open>0){
                open--;
                continue;
            }
            else{
                result.append(str.charAt(i)) ;        
            }
        }
        return result.reverse().toString();
        }
    }