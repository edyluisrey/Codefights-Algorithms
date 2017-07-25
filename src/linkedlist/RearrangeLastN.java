package linkedlist;

public class RearrangeLastN {
	ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
	    if(l==null || n==0) return l;
	    ListNode<Integer> temp = l;
	    int len=1;
	    while(temp.next!=null){
	        temp= temp.next;
	        len++;
	    }
	    temp.next = l;
	    n= n%len;
	    for(int i=0; i<(len-n); i++){
	        temp= temp.next;
	    }   
	    l= temp.next;
	    temp.next=null;
	    return l;
	}

}
