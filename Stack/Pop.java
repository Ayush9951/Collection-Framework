import java.util.*;
class Pop 
{
	public static void main(String args[])
	{
		// pop:- returns EmptyStackException if stack is empty

		Stack<Integer> s=new Stack<>();

		System.out.println(s.pop());		// java.util.EmptyStackException

	        s.push(1);				// [3]->top
		s.push(2);                     		// [2]
		s.push(3);   				// [1]
								  
		System.out.println(s); 	   		// [1,2,3] 	  
							//      ^	  
							//     top		 
		   						   
		// pop:-returns and removes element present at the top of the stack
		
	        int element=s.pop();            	// removes 3   	       
		
		System.out.println(element);    	// 3 		
								
		System.out.println(s);			// [1,2] 	  // [2]->top
	 	   					//    ^		  // [1]
							//   top		
		
	      
			
		
		
		
		
	}
}