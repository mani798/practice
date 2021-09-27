package Practice3;

public class Changetouppercase {
  public static void main(String arg[]) {
	  String s1="abc1@3#xyz";
	  StringBuffer newstr = new StringBuffer(s1);
	  for(int i=0;i<s1.length();i++) {
		  if(Character.isLowerCase(s1.charAt(i))) {
			  newstr.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
		  }
	  }
	  System.out.println("the string after case conversion is " +newstr);
			  
  }
}
