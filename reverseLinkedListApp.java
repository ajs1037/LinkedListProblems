/*
 
  HOW TO REVERSE A LINKED LIST:
  
  Start by asking and answering tiny questions (this is the approach in The Little Lisper):

		1. What is the reverse of null (the empty list)? null.
		2. What is the reverse of a one element list? the element.
		3. What is the reverse of an n element list? the reverse of the 
		   second element on followed by the first element.

 */

class ListNode {
	  int data;
	  ListNode next;

	  ListNode(int d) {
		  data = d;  
		  next = null; 
	  }
	public ListNode Reverse(ListNode list) {
	    if (list == null) return null; // first question
	
	    if (list.next == null) return list; // second question
	
	    // third question - in Lisp this is easy, but we don't have cons
	    // so we grab the second element (which will be the last after we reverse it)
	
	    ListNode secondElem = list.next;
	
	    // bug fix - need to unlink list from the rest or you will get a cycle
	    list.next = null;
	
	    // then we reverse everything from the second element on
	    ListNode reverseRest = Reverse(secondElem);
	
	    // then we join the two lists
	    secondElem.next = list;
	
	    return reverseRest;
	}
	
	public void displayItem() { 
		   System.out.print("/"+data); 
	   }
}

class reverseLinkedListApp {
	   public static void main(String[] args) {
	    
	   }  
	}
