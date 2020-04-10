import java.util.*;
class Size
{
	public static void main(String args[])
	{
		// size

		Stack<Integer> s=new Stack<>();

	        s.push(1);				// [3]->top
		s.push(2);                     		// [2]
		s.push(3);   				// [1]
								  
		System.out.println(s); 			// [1,2,3]

    		System.out.println(s.size()); 		// 3
	}

}