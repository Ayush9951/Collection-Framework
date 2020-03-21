import java.util.*;
import java.util.Iterator;
class Set
{
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
       		list.add(1);
       		list.add(2);
       		list.add(3);
       		list.add(4);
       	        list.add(5);
                System.out.println(list+"\n");       /*  [1,2,3,4,5]  */
		
		// get
		System.out.println(list.get(1)+"\n");/*  2  */
		
		// set
		list.set(1,23);			     /* set method basically replaces the element with the new element only if a element is present at that index */
		System.out.println(list);	     /*  [1,23,3,4,5]  */
		
		list.set(5,40);			     /* as there is no element at index 5 which can be replaced so exception will be thrown	*/
		System.out.println(list);	     /* java.lang.IndexOutOfBoundsException: Index: 5, Size: 5 */
		
		
			
	}
}