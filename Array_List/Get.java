import java.util.*;
class Get
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
       		list.add(1);
        	list.add(2);
        	list.add(3);
                list.add(4);
        	list.add(5);
       		System.out.println(list+"\n");   /*  [1,2,3,4,5]  */
		
		// get(index)
		// Time Complexity:- O(1) constant time
		System.out.println(list.get(0)); /*  1  */
	   	System.out.println(list.get(5)); /* java.lang.IndexOutOfBoundsException: Index: 5, Size: 5 */
		
		
		
	}
}