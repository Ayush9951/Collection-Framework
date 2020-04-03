import java.util.*;
class Poll
{
	public static void main(String args[])
	{
		// poll:- return null if queue is empty

		Queue<Integer> q=new LinkedList<>();
		
		System.out.println(q.poll());  					        //null
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q);		                          
											// [1,2,3]
											//  ^	^
											// top end
		
	        // poll:- returns and removes the element present at the top

		int element=q.poll();							// removes 1
		
		System.out.println(q);        					 	// [2,3]
									   		//  ^ ^
							           			// top end   

		System.out.println(element); 					        // 1				   
			
		
	}
}