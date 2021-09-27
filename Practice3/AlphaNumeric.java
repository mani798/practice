package Practice3;

public class AlphaNumeric {
        public static void main(String arg[]) {
        	String str1="123sdfc",str2="ash3@";
        	System.out.println(str1.matches("[a-zA-Z0-9]+"));
        	System.out.println(str2.matches("[a-zA-Z0-9]+"));
        }
}
