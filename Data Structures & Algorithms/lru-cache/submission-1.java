
class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    Node(){
        this.key = -1;
        this.value = -1;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    int capacity;
    Node left;
    Node right;
    Map<Integer, Node> accessMap;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        accessMap = new HashMap();
        left = new Node();
        right = new Node();
        left.next = right;
        right.prev = left;
    }
    
    public int get(int key) {
        if(accessMap.containsKey(key)){
            Node ele = accessMap.get(key);
            ele.prev.next = ele.next;
            ele.next.prev = ele.prev;

            right.prev.next = ele;
            ele.next = right;
            ele.prev = right.prev;
            right.prev = ele;
            // print();
            // System.out.println(ele.value);
            return ele.value;
        }
        return -1;

    }
    
    public void put(int key, int value) {
        Node newEle = new Node(key,value);
        if(accessMap.containsKey(key)){
            Node existEle = accessMap.get(key);
            existEle.prev.next = existEle.next;
            existEle.next.prev = existEle.prev;
        }
        right.prev.next = newEle;
        newEle.next = right;
        newEle.prev = right.prev;
        right.prev = newEle;
        accessMap.put(key,newEle);
        if(accessMap.size()>capacity){
            Node lruNode = left.next;
            accessMap.remove(lruNode.key);
            left.next = lruNode.next;
            lruNode.next.prev = left;
        }
        print();
        // System.out.println(accessMap);
    }

    void print(){
        Node temp = left;
        while(temp!=null){
            System.out.print("("+temp.key+","+temp.value+") ->");
            temp = temp.next;
        }
    }
}
