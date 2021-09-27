package practice5;

public class CallByValue {
     public static void main(String arg[]) {
    	 int a[]= {10,20};
    	 System.out.println(a[0]);
    	 add(a);
    	 System.out.println(a[0]);
     }
     public static void add(int arr[]) {
    	 System.out.println(arr[0]);
    	 arr[0]=100;
    	 System.out.println(arr[0]);
    	 
     }
}
