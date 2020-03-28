import java.util.*;
class Add
{
	public static void main(String args[])
	{
		
		/*  duplicates will be ignored	          */
		/*  HashSet does not maintains the order  */
		
		// add
		// Time Complexity:- O(1) constant time as internally HashMap is used

		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(20);
		set.add(3);
		set.add(3);    		    /* duplicate will be removed */
		System.out.println(set);    /*  [1,3,20]  */
		
	}
}