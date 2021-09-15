class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        Stack<Character> stackvaild = new Stack<Character>();
        for(char a : s.toCharArray()){
            if(Character.isLetterOrDigit(a)){
                str = str.append(a);
                
            }else{
                continue;
            }
        }
        String strvalid = str.toString().toLowerCase();
        for(char c : strvalid.toCharArray()){
            stackvaild.push(c);
        } 
        return validcheck(strvalid,stackvaild);
    }
    
    
    public boolean validcheck(String strvalid,   Stack<Character> stackvaildcheck){
        for( char c : strvalid.toCharArray()){
            if(c == stackvaildcheck.pop()){
                continue;
            }else{
                return false;
            }
        }
        if(stackvaildcheck.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}