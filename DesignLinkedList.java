class MyLinkedList {

    node head = null;
    public MyLinkedList() {
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0)
            return -1;
        int i = 0;
        node curr = head;
        
        while(i<index)
        {
            if(curr==null)
                return -1;
       //System.out.print(curr.val+" ");
            curr = curr.next;
            i++;
        }
       // System.out.println(curr.val);
        if(curr==null)
            return -1;
        return curr.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
       node x = new node(val);
        if(head==null)
        {
            head = x;
            return;
        }
        x.next = head;
        head = x;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        node x = new node(val);
        if(head==null)
        {
            head = x;
            return;
        }
        node curr = head;
        while(curr.next!=null)
            curr = curr.next;
        curr.next = x;
            
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index<0)
            return;
        if(index==0)
        { this.addAtHead(val);
         return;
        }
        node curr = head;
        int i = 1;
         while(i<index)
        {
            if(curr==null)
                return;
            curr = curr.next;
            i++;
        }
          if(curr==null)
            return;
       node x = new node(val);
        x.next = curr.next;
        curr.next = x;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index<0)
            return;
        if(index==0)
        {
            head = head.next;
            return;
        }
        int i = 1;
        node curr= head;
        while(i<index)
        {
            if(curr==null)
                return;
           curr = curr.next; 
            i++;
        }
        if(curr==null)
            return;
        if(curr.next!=null)
           curr.next = curr.next.next;
    }
}
class node 
{
    int val;
    node next = null;
    public node(int val)
    {
        this.val = val;
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
