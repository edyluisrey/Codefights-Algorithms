package DFSandBFS;

import java.util.ArrayList;
import java.util.List;

public class DigitTreeSum {
	long digitTreeSum(Tree<Integer> t) {
	    if(t==null) return 0;
	    List<List<Integer>> re= new ArrayList<>();
	    sumPath(t,re,new ArrayList<>());
	    System.out.println(re.toString());
	    long sum =0;
	    for(List<Integer> sub: re){
	        StringBuilder number= new StringBuilder();
	        for(int i: sub){
	            number.append(i+"");
	        }
	        sum = sum + Long.parseLong(number.toString());
	    }
	    return sum;
	}

	void sumPath(Tree<Integer> t, List<List<Integer>> re, List<Integer> tempList){
	    if(t==null) return;
	    tempList.add(t.value);
	    if(t.left==null && t.right==null){
	        re.add(new ArrayList<>(tempList));
	    }
	    sumPath(t.left,re,tempList);
	    sumPath(t.right, re, tempList);
	    tempList.remove(tempList.size()-1);
	}

}
