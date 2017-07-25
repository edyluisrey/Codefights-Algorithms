package linkedlist;

public class IsListPalindrome {
	boolean isListPalindrome(ListNode<Integer> l) {
	    ListNode slow = l; ListNode fast = l;
	    while(fast!=null && fast.next!=null){
	        fast= fast.next.next;
	        slow = slow.next;
	    }
	    
	    if(fast!=null){
	        slow= slow.next;
	    }
	    slow = reverse(slow);
	    fast = l;
	    while(slow!=null){  
	        int val1=  (int) slow.value;
		    int val2=  (int) fast.value;
	        if(val1!=val2) return false;
	        slow= slow.next;
	        fast= fast.next;
	    }
	    return true;
	    
	}

	public ListNode reverse(ListNode head){
	    ListNode prev = null;
	    while(head!=null){
	        ListNode temp = head.next;
	        head.next= prev;
	        prev= head;
	        head = temp;
	    }
	    return prev;
	}
}
