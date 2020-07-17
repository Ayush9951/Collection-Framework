import java.util.*;
class Clear
{
	public static void main(String args[])
	{
		// add
		Queue<Integer> q=new LinkedList<>();

		System.out.println(q);	 		// []

		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q);			// [1,2,3]
					       		//  ^	^
							// top end


		// clear :- used to remove elements from queue

		q.clear();

		System.out.println(q);			// []


								
	}
}