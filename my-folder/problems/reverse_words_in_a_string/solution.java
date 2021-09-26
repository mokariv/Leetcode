class Solution {
    public String reverseWords(String s) {
    String [] arrayOfWords = s.trim().split(" +");
    Collections.reverse(Arrays.asList(arrayOfWords));
    return String.join(" ",arrayOfWords);
}
}