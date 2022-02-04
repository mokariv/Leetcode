class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        if(s == null || s.length() == 0){
            return result;
        }
        HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0 ; i<s.length(); i++){
               map.put(s.charAt(i), i); 
            }
        int start = 0;
        int end = map.get(s.charAt(0));
        for(int j = start ; j<s.length(); j++){
                if(map.get(s.charAt(j)) > end){
                    end = map.get(s.charAt(j));
                }
                if( j == end){
                    result.add(end-start+1);
                    if(j+1 < s.length()){
                    start = j+1;
                    end = map.get(s.charAt(start));
                    }
                    
                }
                
            }
        return result;
        }
        
}