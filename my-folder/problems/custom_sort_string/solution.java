class Solution {
    public String customSortString(String order, String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0 ; i<s.length() ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0; j<order.length(); j++) {
            if (map.containsKey(order.charAt(j))) {
                int times = map.get(order.charAt(j));
                for(int k = 0 ;k<times ; k++){
                    result.append(order.charAt(j));  
                }
            }
            map.remove(order.charAt(j));
        }
        for(char c : map.keySet()){
            int repeat = map.get(c);
            for(int l = 0 ;l<repeat; l++){
                   result.append(c); 
                }
        }
        return result.toString();
        
    }
}