import java.util.*;
class Push
{
 	public static void main(String args[])
	{
		// push	
									
		Stack<Integer> s=new Stack<>();   	
		
		s.push(1);				//  [1]->top			
			
		s.push(2);				//  [2]->top
							//  [1]	
			
		s.push(3);			        //  [3]->top
							//  [2]	
							//  [1]
		   
		System.out.println(s);                  // [1,2,3]
							//	^
							//     top		  
							   	
	}   
}