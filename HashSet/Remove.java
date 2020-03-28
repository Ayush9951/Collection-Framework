import java.util.*;
class Remove
{
	public static void main(String args[])
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(5);
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(6);
		System.out.println(set);   /* [1,2,4,5,6] */
		
		// remove
		// Time Complexity:- O(1)

		set.remove(1);
		System.out.println(set);   /* [2,4,5,6]   */
		
		// it returns true if element is present otherwise returns false
		
		boolean x=set.remove(1);   /* As 1 has been removed above */
		System.out.println(x);     /* false */
		
		boolean y=set.remove(2);
		System.out.println(y);     /* true  */
		
		System.out.println(set);   /* [4,5,6] */
		
	}
}