package practice5;

public class MethodOverloadingExample {
        public static void main(String arg[]) {
        	add(3,5);
        	add(4.5,7.8);
        	add(true , false);
        	
        }
        
        public static void add(int a, int b) {
        	System.out.println(a+b);
        }
        public static void add(double x, double y) {
        	System.out.println(x+y);
        }
        public static void add(boolean x, boolean y) {
        	System.out.println(x+" "+y);
        }
        
}
