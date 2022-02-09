class Solution {
    public int fib(int n){
        if(n <= 1){
            return n;
        }
        int cache[] = new int[n+1];
        cache[1] =1;
        for(int i=2; i<cache.length; i++){
             cache[i] = cache[i-2]+cache[i-1];
        }
        return cache[n];
        

    }
}