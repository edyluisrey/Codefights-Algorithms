package arrays;

public class FirstNotRepeatingCharacter {
	char firstNotRepeatingCharacter(String s) {
		int count [] = new int[26];
		for(int i = 0; i < s.length(); i ++)
		    count [s.charAt(i)-97] ++;
		for(int i = 0; i < s.length(); i ++)
		    if(count [s.charAt(i)-97] == 1)
		        return s.charAt(i);
		return '_';
	}
}
