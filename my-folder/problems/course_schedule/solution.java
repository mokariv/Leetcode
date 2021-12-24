class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses == 0){
            return true;
        }
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int [] indegree = new int[numCourses];
        for(int []edge : prerequisites){
            indegree[edge[0]]++;
            if(!map.containsKey(edge[1])){
                map.put(edge[1], new ArrayList<>());
            }
            map.get(edge[1]).add(edge[0]);       
        }
        for(int i = 0 ; i< indegree.length; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            count++;
            List<Integer> deps = map.get(curr);
            if(deps != null){
            for(int edge : deps){
                indegree[edge]--;
                if(indegree[edge] == 0){
                    q.add(edge);
                }
            }
        }
        }
        if(count == numCourses){
            return true;
        }
        else{
            return false;
        }      
    }
}