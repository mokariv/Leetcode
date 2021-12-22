class Solution {
    public int strStr(String haystack, String needle) {
       
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else if (!(haystack.contains(needle)))
            return -1;
 else
        
        return 0;
        
        
   
    }
}