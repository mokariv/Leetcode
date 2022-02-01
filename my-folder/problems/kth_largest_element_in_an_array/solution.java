class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int ln = nums.length;
        int result = Integer.MAX_VALUE;
        for(int n : nums){
            pq.add(n);
            if(pq.size() > ln-k){
                if(pq.peek() < result){
                    result = pq.peek();
                }
                pq.poll();
            }
        }
        return result;
        
    }
}