class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int n = s.length();
        int slow = 0;
        int max = 0;
        for (int i = 0; i<n; i++) {
            if (map.containsKey(s.charAt(i))) {
                slow = Math.max(slow, map.get(s.charAt(i)));
                map.put(s.charAt(i),i+1); 
            }
            else
            {
            map.put(s.charAt(i),i+1);
            }
            max = Math.max(max, i- slow + 1);
        }
        return max;
}
}