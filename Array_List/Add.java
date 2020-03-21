import java.util.*;
class Add
{
   	public static void main(String args[])
   	{
		// add
		// Time Complexity:- O(1) constant Time
        	ArrayList<Integer> list=new ArrayList<>();
        	list.add(1);
        	list.add(2);
        	list.add(3);
        	list.add(4);
        	list.add(5);
        	System.out.println(list+"\n");   /*  [1,2,3,4,5]  */
		
		/* adding an element at a specific position */
		
		list.add(0,10);
		System.out.println(list+"\n");   /*  [10,1,2,3,4,5] */
	    	list.add(6,20);       		 /*  we can add an element at a position which can be equal to the size of ArrayList also*/
		System.out.println(list+"\n");   /*  [10,1,2,3,4,5,20]*/
		list.add(8,30);                  /*  as the size of ArrayList is 7 and we r adding the element at index 8 so exception will be thrown*/
		System.out.println(list+"\n"); 
		
	
        }
}