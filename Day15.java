public static  Node insert(Node head,int data){
    // if list has no elements, return a new node
    if(head == null){
        return new Node(data);
    }
        
    // else iterate through list, add node to tail, and return head
    Node tmp = head;
    while(tmp.next != null){
        tmp = tmp.next;
    }
    tmp.next = new Node(data);
            
    return head;
}
