package practice5;

public class Varargs {
	public static void main(String[] args) {
		var();
		var(1);
		var(1,2,3);
		
	}
	  static void var(int ...a) {
		  System.out.println("Number of arugments " + a.length);
		  for(int i : a) 
		System.out.print(i + " ");
		System.out.println();
		
	 }
}
