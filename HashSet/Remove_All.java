import java.util.*;
class Remove_All
{
	public static void main(String args[])
	{
		// Hash_set1
		HashSet<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(set1);	/* set1=[1,2,3] */
		
		// Hash_set2
		HashSet<Integer> set2=new HashSet<>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println(set2);	/* set2=[4,5,6] */
		
		// addAll
		set1.addAll(set2);
		System.out.println(set1);	/* set1=[1,2,3,4,5,6]  */
		
		// removeAll
		set1.removeAll(set2);		
		System.out.println(set1);       /* set1=[1,2,3]  */
		
		// removeAll:- return true or false
		boolean x=set1.removeAll(set2); /* as elements of set2[4,5,6] r not present in set1[1,2,3] now */
		System.out.println(x);		/* so it returns false  */
		
		
		
		HashSet<String> set3=new HashSet<>();
		set3.add("abc");		/* set3["abc","ghi"]  */
		set3.add("ghi");
		
		HashSet<String> set4=new HashSet<>();
		set4.add("abc");
                set4.add("jkl");		/* set4=["abc","jkl","mno"] */
		set4.add("mno");
		
		set3.removeAll(set4);   	/* only those elements of set4 which r present in set3 i.e ["abc"] will be removed from set3 */
		System.out.println(set3);       /* set3=[ghi]  */

		set3.add("abc");		/* set3=["abc","ghi"] */
		set4.removeAll(set3);
		System.out.println(set4);	/* set4=["jkl","mno"] */

		
			
	}
}
