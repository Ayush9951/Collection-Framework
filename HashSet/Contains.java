import java.util.*;
class Contains
{
	public static void main(String args[])
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);	 /* [1,2,3] */
		
		// contains
		// Time Complexity:- O(1)

		boolean x=set.contains(1); 
		System.out.println(x);		/* true as 1 is present in the hashset */
		
		boolean y=set.contains(4);
		System.out.println(y);		/* false as 4 is not present in the hashset */
		
	}
}
