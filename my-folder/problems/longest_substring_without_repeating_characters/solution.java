class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mapstore = new HashMap<Character, Integer>();
        int n = s.length();
        int sol = 0;
        for(int i =0 , j =0 ;j<n ;j++){
            if(mapstore.containsKey(s.charAt(j))){
                i = Math.max(mapstore.get(s.charAt(j)), i);
            }
            mapstore.put(s.charAt(j), j+1);
            sol = Math.max(sol, j-i+1);
        }
        return sol;        
}
}