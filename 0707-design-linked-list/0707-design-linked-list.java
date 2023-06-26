class MyLinkedList {
    private ListNode dummy = new ListNode();
    private int c;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index<0 || index>=c){
            return -1;
        }
        var curr=dummy.next;
        while(index>0){
            curr=curr.next;
            index--;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(c,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>c){
            return;
        }
        var p = dummy;
        while(index>0){
            p=p.next;
            index--;
        }
        p.next = new ListNode(val,p.next);
        ++c;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=c){
            return;
        }
        var p = dummy;
        while(index>0){
            p=p.next;
            index--;
        }
        var t = p.next;
        p.next = t.next;
        t.next = null;
        --c;
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