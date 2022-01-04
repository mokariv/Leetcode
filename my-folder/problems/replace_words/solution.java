class Solution {
    class TrieNode{
        TrieNode children[];
        boolean is_end;
        TrieNode(){
            children = new TrieNode[26];
            is_end = false;
        }
    }
    TrieNode root = new TrieNode();
    void insert(String word){
        TrieNode curr;
        curr = root;
        for(int i =0 ; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
        }
        curr.is_end = true;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        for(String word : dictionary){
            insert(word);
        }
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i<words.length ; i++){
            if( i != 0){
                result.append(" ");
            }
          StringBuilder replacemnt  = new StringBuilder();
         String currentString = words[i];
         TrieNode curr = root;
            for( int j = 0 ; j<currentString.length() ; j++){
                int index = currentString.charAt(j) - 'a';
                if(curr.children[index] == null || curr.is_end) break;
                replacemnt.append(currentString.charAt(j));
                curr = curr.children[index];
            }
            if(curr.is_end){
                result = result.append(replacemnt);
            }else{
                result = result.append(currentString);
            }
        }
    
        return result.toString();
        
    }
}