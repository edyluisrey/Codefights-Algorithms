package trees;

public class KthLargestInBST {
	class Result{
	    int count;
	    int res;
	    Result(int x, int y){
	        count =x; res= y;
	    }
	}
	int kthLargestInBST(Tree<Integer> t, int k) {
	    Result result = new Result(0,0);
	    helper(t, k, result);
	    return result.res;
	}

	void helper(Tree<Integer> t, int k, Result result){
	    if(t.left!= null) helper(t.left, k, result);
	    result.count++;
	    if(result.count==k){
	        result.res= t.value;
	        return;
	    }
	    if(t.right!=null) helper(t.right, k, result);
	}



}
