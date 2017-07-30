package CommonTechniques;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {
	boolean sumOfTwo(int[] a, int[] b, int v) {
	    if(a.length==0 && b.length==0) return false;
	    Set<Integer> set = new HashSet<>();
	    for(int i = 0; i< a.length; i++ )
	        set.add(v-a[i]);
	    for(int i=0; i< b.length; i++){
	        if(set.contains(b[i])) return true;
	    }
	    return false;
	}
}
