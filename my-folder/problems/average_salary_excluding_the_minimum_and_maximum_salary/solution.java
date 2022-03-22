class Solution {
    public double average(int[] salary) {
         double count = 0;
        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< salary.length ; i++){
            count = count+salary[i];
            if (salary[i]< min) {
                min = salary[i];
            }
            if (salary[i]> max) {
                max = salary[i];
            }   
        }
    
        count = count - (min+max);
        count = count/(salary.length - 2);

        return count;
        
    }
}