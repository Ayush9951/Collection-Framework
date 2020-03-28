import java.util.*;
class For_Each
{
	public static void main(String args[])
	{
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set); 	 // [1,2,3]
		
		for(Integer i:set)		 // int or Integer can be used	
		{
			System.out.print(i+" "); // 1,2,3
		}
	}
}