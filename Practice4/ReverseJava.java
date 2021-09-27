package Practice4;

public class ReverseJava {
	public static void main(String[] args) {
	    String str="Java is better than python";
		String[] strArr = str.split(" ");
		String reverse=" ";
		for(int i=0; i<strArr.length; i++) {
			
			
			reverse = reverse+reversed(strArr[i]+"");	
		
		}
		System.out.println(reverse);
		}

	      public static String reversed(String strArr2) {
		
		String reversed=" ";
		
		for(int i=strArr2.length()-1; i>-1; i--) {
		
		reversed=reversed+strArr2.charAt(i);
		}
		

	     return reversed; 
		
	    }
}
