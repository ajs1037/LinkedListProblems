/*
 * HOW TO CHECK IF LINKED LIST HAS CYCLE:
 */

class checkLinkedListForCycles {
	
	boolean hasCycle(ListNode head) {
		if(head == null) return false;
		ListNode fast = head.next;
		ListNode slow = head;
		while(fast != null && fast.next != null && slow != null) {
			// check if they have collided
			if(fast == slow) {
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
	
	
	   public static void main(String[] args) {
	    
	   }  
}
