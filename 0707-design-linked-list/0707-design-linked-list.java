class MyLinkedList {
    
    class Node{
      private int val;
      private Node next;
      
      public Node(int val) {
          this.val = val; 
      }
      
       public Node(int val, Node next) { 
          this.val = val; 
          this.next = next; 
      }
    }
    
    private int size;
    private Node head;
    private Node tail;
    
    // Intialize the data structure
    
    public MyLinkedList() {
        this.size = 0;    
        this.head = null;
        this.tail = null;
    }
    
    
    // get value at ith index
    public int get(int index) {
        if(index>=size || index < 0){
            return -1;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    // add at head
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(size == 0) {
            head = temp;
            tail = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    
    public void addAtTail(int val) {
        if(tail==null) {
             addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0) {
             addAtHead(val);
            return;
        }
        
        if(index == size) {
             addAtTail(val);
            return;
        }
        if(index>=size || index < 0){
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteFirst() {
        if(size == 0) {
            return;
        }
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
    }
    
     public void deleteLast() {
        if(size<=1) {
             deleteFirst();
            return;
        }
         Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    
    public void deleteAtIndex(int index) {
        if(index==0) {
             deleteFirst();
            return;
        }
        if(index==size-1) {
             deleteLast();
            return;
        }
        if(index>=size){
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
   
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */