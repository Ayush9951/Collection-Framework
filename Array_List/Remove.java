import java.util.*;
public class Remove
{
	 public static void main(String args[])
	 {
		 // remove 
		 // Time Complexity:- O(n) 'linear time' as we have to iterate to find the element
		 ArrayList<Integer> list=new ArrayList<>();
       		 list.add(10);
       		 list.add(20);
        	 list.add(30);
        	 list.add(40);
        	 list.add(50);
        	 System.out.println(list); /*  [10,20,30,40,50]	*/
		 list.remove(2);           /*  index wise removal and it starts from 0	*/
		 System.out.println(list); /*  [10,20,40,50]   */
			
		 /*
		 for only 'String' we can use both index as well as the value for removal
		 */	
		
		 // clear
		
		 list.clear();		   /*   to remove all the elements in ArrayList  */
		 System.out.println(list); /*  []  */
		
	
	 }
}
