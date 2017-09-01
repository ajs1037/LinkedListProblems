/*
 * HOW TO FIND THE LENGTH OF A LINKED LIST:
 *
 */

class LinkedListIterative {	
	
	/*                 Iterative Solution
	 *
	 *	1) Initialize count as 0 
	 *	2) Initialize a node pointer, current = head.
	 *	3) Do following while current is not NULL
	 *	     a) current = current -> next
	 *	     b) count++;
	 *	4) Return count 
	 *
	 */
	
	
	ListNode head;
	 
    // Inserts a new Node at front of the list.
    public void push(int newData) {
        // Allocate the Node & Put in the data
        ListNode newNode = new ListNode(newData);
 
        // Make next of new Node as head 
        newNode.next = head;
 
        // Move the head to point to new Node
        head = newNode;
    }
 
    // Returns count of nodes in linked list 
    public int getCount() {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
    

class LinkedListRecursive {
	
	/*
	 *              Recursive Solution
	 *
	 * 	int getCount(head)
	 * 	1) If head is NULL, return 0.
	 * 	2) Else return 1 + getCount(head->next) 
	 *
	 */
	
    ListNode head;
 
    // Inserts a new Node at front of the list.
    public void push(int newData) {
        // Allocate the Node & Put in the data
        ListNode newNode = new ListNode(newData);
 
        // Make next of new Node as head
        newNode.next = head;
 
        // Move the head to point to new Node
        head = newNode;
    }
 
    // Returns count of nodes in linked list
    public int getCount(ListNode node) {
        if (node == null)
            return 0;
 
        // Count is this node plus rest of the list
        return 1 + getCount(node.next);
    }
 
    // Wrapper over getCountRec()
    public int getCount() {
        return getCount(head);
    }
}

class FindLinkedListLength {
	
    public static void main(String[] args) {
		  
	}  
}
