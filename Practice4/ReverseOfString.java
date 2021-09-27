package Practice4;

public class ReverseOfString {
      public static void main(String arg[]) {
    	  String str="GEEKSTER";
    	  String reversestr="";
    	  for(int i=str.length()-1;i>=0;i--) {
    		  char newChar=str.charAt(i);
    		  reversestr=reversestr+newChar;
    	  }
    	  System.out.println(reversestr);
    			  
      }
}
