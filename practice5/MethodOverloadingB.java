package practice5;

public class MethodOverloadingB {
	
public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static void sum(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	public static void sum(double a,double b) {
		System.out.println(a+b);
	}
}
