public class IntSLList {
    protected IntSLLNode head, tail;

    public IntSLList() { head = tail = null; }

    public boolean isEmpty() { return head == null; }

    public void addHead(int element) {
        head = new IntSLLNode(element,head);
        if (tail == null) tail = head;
    }

    public void addTail(int element) {
        if (!isEmpty()) {
        tail.next = new IntSLLNode(element);
        tail = tail.next;
        } else head = tail = new IntSLLNode(element);
        }
    
    public int deleteHead() {
        int element = head.info;
    
        if (head == tail) head = tail = null;
        else head = head.next;
        
        return element;
    }

    public int deleteTail() {
        int element = tail.info;

        if (head == tail) head = tail = null;
        else { 
            IntSLLNode tmp; 
            for (tmp = head; tmp.next != tail; tmp = tmp.next) {}
            tail = tmp; 
            tail.next = null;
        } return element;
    }
    
    public void printList() {
        for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
    }
    
    public boolean isInList(int element) {
        IntSLLNode tmp;
        for (tmp = head; tmp != null && tmp.info != element; tmp = tmp.next) {}            
        return tmp != null;
    }
    
    public void deleteElement(int element) { 
        if (!isEmpty()) {
            if (head == tail && element == head.info) {
                head = tail = null;
            } else if (element == head.info) {
                head = head.next;
            } else { 
                IntSLLNode previous, tmp;
                for (previous = head, tmp = head.next; tmp != null && tmp.info != element; previous = previous.next, tmp = tmp.next) {}
                if (tmp != null) {
                    previous.next = tmp.next;
                    if (tmp == tail) tail = previous;
                }
            }
        }
    }
}