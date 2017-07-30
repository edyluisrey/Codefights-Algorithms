package CommonTechniques;

import java.util.HashSet;

public class ContainsDuplicates {
	boolean containsDuplicates(int[] a) {    
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i =0; i< a.length; i++){
	        if(set.contains(a[i])) return true;
	        set.add(a[i]);
	    }
	    return false;
	}
}
