class LRUCache {
    class Node{
        int key;
        int value;
        Node previous;
        Node next;
        public Node(int key, int val){
            this.key = key;
            this.value = val;
        }
    }
    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    int capacity ;
    
    public void removenode(Node node){ 
            node.previous.next = node.next;
            node.next.previous = node.previous;
    }
    
    public void addnode(Node node){
        node.previous = head;
        node.next = head.next;
        head.next.previous = node; 
        head.next = node;
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        map = new HashMap();
        head.next = tail;
        tail.previous = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        removenode(node);
        addnode(node);
        return node.value;
    }
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removenode(node);
            addnode(node);       
        }
        else if (capacity == map.size()) {
            Node tailprev = tail.previous;
            removenode(tailprev);
            map.remove(tailprev.key);
            Node newNode = new Node(key, value);
            map.put(key,newNode);   
            addnode(newNode);
        }else{
            Node newNode = new Node(key, value);
            addnode(newNode);
            map.put(key,newNode);     
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */