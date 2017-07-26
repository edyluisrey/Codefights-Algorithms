package trees;

public class IsSubtree {
	boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
	    if(t1==null && t2==null) return true;
	    if(t1==null) return false;
	    if(t2==null) return true;
	    if(t1.value.equals(t2.value)) return  sameTree(t1,t2);
	    return  isSubtree(t1.left, t2) || isSubtree(t1.right, t2); 
	}

	boolean sameTree(Tree<Integer> t1, Tree<Integer> t2){
	    if(t1==null && t2==null) return true;
	    if(t1==null || t2==null) return t1==t2;
	    if(!t1.value.equals(t2.value))  return false;
	    return sameTree(t1.left, t2.left) && sameTree(t1.right, t2.right);
	}
}
