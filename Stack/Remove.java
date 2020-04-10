import java.util.*;
class Remove
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);		          			//  2 [3]->top
		s.push(3);				  		//  1 [2]	
							     		//  0 [1]
								  
		System.out.println(s);    				// [1,2,3]
		
		

		// remove(index):-index starts from 0
		// it returns and remove the element from the stack
		
		int element=s.remove(1);				//  2 will be removed from the stack
		
		System.out.println(element);	  			//  2
									
		System.out.println(s);				        // [1,3]
								  	//    ^
									//   top
		
		s.remove(3);	//java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 3
								
								
	}
}