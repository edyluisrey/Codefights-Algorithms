package trees;

public class IsTreeSymmetric {
	boolean isTreeSymmetric(Tree<Integer> t) {
	    if(t==null) return true;
	    return helper(t.left, t.right);
	}

	boolean helper(Tree<Integer> t, Tree<Integer> t1){
	    if(t==null && t1==null) return true;
	    if(t==null || t1==null) return false;
	    if(!t.value.equals(t1.value)) return false;
	    return helper(t.left, t1.right) && helper(t.right, t1.left);
	} 
}
