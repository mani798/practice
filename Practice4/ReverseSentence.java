package Practice4;

public class ReverseSentence {
         public static void main(String arg[]) {
        	 String str="My Name Is Mani";
        	 
        	 String arr[]=str.split(" ");
        	 for(int i=arr.length-1;i>=0;i--) {
        		 System.out.print(arr[i]+" ");
        	 }
         }
}
