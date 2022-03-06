class Solution {
    public String minWindow(String s, String t) {
        //edge case:
        //"ADOBECODEBANC"
        //  in
        //      i
        //ds 
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer> subMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String res = "";
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < s.length(); i++) {
            sb.append(s.charAt(i));
            //update the subMap
            //System.out.println(sb.toString());
            subMap.put(s.charAt(i), subMap.getOrDefault(s.charAt(i), 0) + 1);
            if (contains(subMap, tMap)) {
                while (sb.length() >= t.length() && contains(subMap, tMap)) {
                    if (min > i - index + 1) {
                        min = i - index + 1;
                        res = sb.toString();
                    }
                       char d = sb.charAt(0);
                        subMap.put(d, subMap.get(d) - 1);
                       // System.out.println(sb.toString());
                        sb.deleteCharAt(0);
                        //System.out.println(sb.toString());
                        index++;
                }                
            }
            
        }
        return res;
        
    }
    private boolean contains (Map<Character, Integer> subMap, Map<Character, Integer> tMap) {
        for (char c : tMap.keySet()) {
            if (!subMap.containsKey(c)) {
                return false;
            }else if (subMap.get(c) < tMap.get(c)){
                return false;
            }
        }
        return true;
    }
}