class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String a : strs){
            char[] b = a.toCharArray();
            Arrays.sort(b);
            String sortedA = String.valueOf(b);
            // String sortedA = b.toString();
            if(!map.containsKey(sortedA)){
                map.put(sortedA,new ArrayList<>());
                map.get(sortedA).add(a);
            }else{
                map.get(sortedA).add(a);
            }   
        }
        return new ArrayList<>(map.values());
        
    }
}