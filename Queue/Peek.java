import java.util.*;
class Peek
{
	public static void main(String args[])
	{
		// Peek:- returns null if queue is empty
		
		Queue<Integer> q=new LinkedList<>();
		
		System.out.println(q.peek());		// null
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q);			// [1,2,3]
							//  ^	^
							// top end
		
		// peek:- returns element present at the top without removing it from the queue
		
		System.out.println(q.peek());		// 1
		
		System.out.println(q);			// [1,2,3]
							//  ^	^
							// top end

		
	}
}