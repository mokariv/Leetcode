class MyHashSet {
    int buckets = 1000; 
    int bucketItems = 1000; 
    boolean storage [][];

    public MyHashSet() {
        storage = new boolean[buckets][];
        
    }
    public int getbucket(int key){
         return key%1000;
    }
    
    public int getbucketitem(int key){
        return key/1000;
    }
    
    public void add(int key) {
            int getbucket = getbucket(key);
            int getbucketItem = getbucketitem(key);
            if (storage[getbucket] == null ) {
                if ( getbucket == 0) {
                    storage[getbucket] = new boolean [bucketItems+1];   
                }
                else {
                     storage[getbucket] = new boolean[bucketItems];
                }         
            }
         storage[getbucket][getbucketItem] = true;
        
        }
        
    
    public void remove(int key) {
            int getbucket = getbucket(key);
            int getbucketItem = getbucketitem(key);
            if (storage[getbucket] != null ) {
                 storage[getbucket][getbucketItem] = false;
            }
        
        
    }
    
    public boolean contains(int key) {
        int getbucket = getbucket(key);
        int getbucketItem = getbucketitem(key);
        if (storage[getbucket] == null ) {
                 return   false;
            }

        return storage[getbucket][getbucketItem];

        
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */