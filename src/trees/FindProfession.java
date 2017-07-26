package trees;

public class FindProfession {
	String findProfession(int level, int pos) {
		   if(level==1)
		       return "Engineer";
		   if(findProfession(level-1,(pos+1)/2).equals("Doctor")){
		        if(pos%2!=0) return "Doctor";
		        else return "Engineer";
		   }
		   if(pos%2!=0) return "Engineer";
		   else return "Doctor";   
    }
}
