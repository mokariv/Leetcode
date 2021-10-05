class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) ->{
            String [] log1Split =log1.split(" ", 2);
            String [] log2Split = log2.split(" " ,2);
            boolean isLog1digitLog = Character.isDigit(log1Split[1].charAt(0));
            boolean isLog2digitLog = Character.isDigit(log2Split[1].charAt(0));
            if(!isLog1digitLog && !isLog2digitLog){
                int compare = log1Split[1].compareTo(log2Split[1]);
                if(compare == 0){
                    return log1Split[0].compareTo(log2Split[0]);
                }
                return compare;    
            }
            if(isLog1digitLog){
                 if(isLog2digitLog){
                      return 0;
                 }
                return 1;
            }
            else{
                return -1; 
            }
                
            });
            return logs;
        
    }
} 