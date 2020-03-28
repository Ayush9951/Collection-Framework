import java.util.*;
class Iterator
 {
	public static void main (String[] args) 
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);	        /* [1,2,3] */
		
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" "); /*  1,2,3  */
		}
		
	}
}