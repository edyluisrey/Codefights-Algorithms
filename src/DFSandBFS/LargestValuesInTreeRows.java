package DFSandBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValuesInTreeRows {
	int[] largestValuesInTreeRows(Tree<Integer> t) {
	    if(t==null) return new int[0];
	    List<Integer> list = new ArrayList<>();
	    Queue<Tree<Integer>> q = new LinkedList<>();
	    q.offer(t);
	    while(!q.isEmpty()){
	        int max=Integer.MIN_VALUE;
	        int size= q.size();
	        for(int i = 0; i< size; i++){
	            Tree<Integer> tempNode= q.poll();
	            max = Math.max(max, tempNode.value);
	            if(tempNode.left!= null) q.offer(tempNode.left);
	            if(tempNode.right!=null) q.offer(tempNode.right);
	        }
	        list.add(max);
	    }
	    int[] re= new int[list.size()];
	    for(int i= 0; i<list.size(); i++)
	        re[i]= list.get(i);
	    return re;
	}

}
