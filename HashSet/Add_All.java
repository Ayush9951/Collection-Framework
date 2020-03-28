import java.util.*;
class Add_All
{
	public static void main(String args[])
	{
		// Hash_set1
		HashSet<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(set1);	 /*   set1=[1,2,3] order may or  may not be preserved*/
		
		// Hash_set2
		HashSet<Integer> set2=new HashSet<>();
		set2.add(4);
		set2.add(6);
		set2.add(5);
		System.out.println(set2);	 /*  set2=[4,5,6]       */
		
		// addAll
		set1.addAll(set2); 
		System.out.println(set1);	 /*  set1=[1,2,3,4,5,6]	*/
		
		// addAll:- returns true or false
		boolean x=set1.addAll(set2);     /*  as the elements of set2[4,5,6] r already present in set1[1,2,3,4,5,6] */
		System.out.println(x);		 /*  so false will be returned */
		
		boolean y=set2.addAll(set1);     /*  in set1[1,2,3,4,5,6] i.e [1,2,3] r not present in set2 [4,5,6] so they can be added to set2 */
		System.out.println(set2);	 /*  and now set2 becomes[1,2,3,4,5,6] */
		System.out.println(y);		 /*  true  */
		
	
		
		
	
		
		
	}
}