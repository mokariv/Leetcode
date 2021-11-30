class Solution {
    public boolean isIsomorphic(String s, String t) {
        
    HashMap<Character, Character> sMap = new HashMap<Character, Character>();
    HashMap<Character, Character> tMap = new HashMap<Character, Character>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i= 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(sMap.containsKey(a)){
                if(sMap.get(a) != t.charAt(i)){
                    return false;
                }
            }else if(tMap.containsKey(t.charAt(i))){
                    return false;
                }
                else{
                    sMap.put(a, t.charAt(i));
                    tMap.put(t.charAt(i),a);
                }
            }  
        return true;
        
        
    }
}