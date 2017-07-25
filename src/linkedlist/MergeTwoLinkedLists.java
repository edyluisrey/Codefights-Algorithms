package linkedlist;

public class MergeTwoLinkedLists {
	ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
	     ListNode<Integer> list = new ListNode<Integer>(0);
	     ListNode<Integer> head =list;
	     while( l1!=null && l2!=null){
	          if(l1.value<=l2.value){
	               head.next = l1;
	               l1= l1.next;
	          }else{
	               head.next = l2;
	               l2= l2.next;
	          }
	          head = head.next;
	     }
	     
	     if (l1!=null){
	          head.next = l1;
	     }
	     if(l2!=null){
	          head.next = l2;
	     }
	      
	     return list.next;
	}

}
