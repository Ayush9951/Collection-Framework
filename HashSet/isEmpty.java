import java.util.*;
class isEmpty
{
	public static void main(String args[])
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);	    /* [1,2,3] */
		// size
		System.out.println(set.size());     /* 3  */
		
		// isEmpty:- true if set is empty otherwise false
		System.out.println(set.isEmpty());  /* false */
		
		// clear
		set.clear();
		System.out.println(set);	    /* [] */
		System.out.println(set.isEmpty());  /* true */
		
		
		
	}
}
