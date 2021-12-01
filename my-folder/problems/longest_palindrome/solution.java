class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s == null || s.length()<=0){
            return -1;
        }
        int count = 0;
        char[] a = s.toCharArray();
        for(char c : a){
            if(set.contains(c)){
                count = count+2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        if(set.isEmpty()){
            return count;
        }
        else{
          return  count+1;
        }
    }
}