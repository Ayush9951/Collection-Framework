import java.util.*;
class Size
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		// size
		System.out.println("Initial size : "+list.size()+"\n");  /*  0  */
		list.add(1);
       		list.add(2);
        	list.add(3);
        	list.add(4);
       		list.add(5);
		
       	        System.out.println(list+"\n");   /*  [1,2,3,4,5]  */
		System.out.println("Updated size : "+list.size()+"\n"); 

		
		
	}
}