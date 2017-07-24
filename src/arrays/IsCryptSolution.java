package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsCryptSolution {
	boolean isCryptSolution(String[] crypt, char[][] solution) {
	    HashMap<Character, Character> map = new HashMap<>();
	    for(int i=0; i< solution.length; i++){
	        map.put(solution[i][0], solution[i][1]);
	    }
	    List<String> list = new ArrayList<>(); 
	    for(String str: crypt){
	        if(map.get(str.charAt(0))=='0' && str.length()>1) return false;
	        StringBuilder s = new StringBuilder();
	        for(char c: str.toCharArray()){
	            s.append(map.get(c)+"");
	        }
	        list.add(s.toString());
	    } 
	    System.out.println(list.toString());
	    double num1= Double.parseDouble(list.get(0));
	    double num2= Double.parseDouble(list.get(1));
	    double num3= Double.parseDouble(list.get(2));
	    if(num1+num2==num3) return true;
	    return false;
	        
	}

}
