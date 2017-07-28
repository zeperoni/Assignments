
public class fibonacci {

 public static void main(String[] args)
 {
	 int index = 0;
	 int index2 = 1;
	
	 for(int counter = 0; counter<100; counter++)
	 {
		 System.out.print(index + " " + index2 + " ");
		 index= index + index2;
		 index2 = index + index2;
	 }
	 
 }
}
