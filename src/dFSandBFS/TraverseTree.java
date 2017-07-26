package DFSandBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraverseTree {
	int[] traverseTree(Tree<Integer> t) {
	    if(t==null)  return new int[0];
	    List<Integer> list = new ArrayList<Integer>();
	    Queue<Tree<Integer>> q = new LinkedList<>();
	    q.offer(t);  
	    while(!q.isEmpty()){  
	        int size= q.size();
	       // for(int)
	        Tree<Integer> curr = q.poll();   System.out.println(curr.value);
	        list.add(curr.value);
	        if(curr.left!=null) q.offer(curr.left);
	        if(curr.right!=null) q.offer(curr.right);
	        
	    }
	    System.out.println(list.toString());
	    int[] num = new int[list.size()]; 
	    for(int i =0; i< list.size(); i++)
	        num[i]= list.get(i);
	    return  num;
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

