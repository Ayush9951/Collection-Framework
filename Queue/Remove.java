import java.util.*;
class Remove
{
	public static void main(String args[])
	{
		// remove:- throws java.util.NoSuchElementException if queue is empty
		
		Queue<Integer> q=new LinkedList<>();
		
		q.remove();  							         // exception
		
		q.add(1);
		q.add(2);
		q.add(3);
											// [1,2,3]
											//  ^	^
											// top end
		
		// remove:-returns and removes the element present at the top
		
		int element=q.remove();							// removes 1
		
		System.out.println(q); 							// [2,3]
							   				//  ^ ^
							   				// top end

		System.out.println(element); 						// 1
							  
	}
}