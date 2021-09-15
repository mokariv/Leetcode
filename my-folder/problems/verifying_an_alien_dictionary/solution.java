class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] intArray = new int[26];
        int i =0;
        for( char al : order.toCharArray()){
            intArray[al -'a'] = i;
            i++;
        }
        for(int k =1; k< words.length ;k++){
            if(!alien(words[k-1], words[k], intArray)){
                return false;
            }           
        }
        return true;
        
    }   
        public static boolean alien(String a , String b, int intArray[]){
            System.out.print(a);
            System.out.print(b);
            boolean same= true;
            for(int l= 0; l< a.length() && l < b.length() ; l++){
                char al = a.charAt(l);
                char bl = b.charAt(l);
                if(al == bl){
                    continue;
                }else if(al != bl) {
                    same = false;
                }
                if(!same){
                    return intArray[al-'a'] < intArray[bl-'a']? true : false;
                }  
            }
            if(a.length() > b.length()){
                  return false;
              }
            return true;
        }
        
}