package trees;

public class HasPathWithGivenSum {
	
	boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
	    if(t==null && s==0) return true;
	    if(t==null) return false;
	    return helper(t, s);
	   
	}

	boolean helper(Tree<Integer> t, int s){
	    if(t==null) return false;  
	    if(t.left==null && t.right==null){
	        return s==t.value;
	    } 
	    return helper(t.left, s-t.value) || helper(t.right, s-t.value);   
	}

}

class Tree<T> {
	Tree(T x) {
		value = x;
	}
	T value;
	Tree<T> left;
	Tree<T> right;
}
