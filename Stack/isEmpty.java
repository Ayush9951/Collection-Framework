import java.util.*;
class isEmpty
{
	public static void main(String args[])
	{
		// isEmpty

		Stack<Integer> s=new Stack<>();

		System.out.println(s);			  // []

		System.out.println(s.isEmpty());          // true
		
		s.push(1);
		s.push(2);
		s.push(3);

		System.out.println(s);			  // [1,2,3]

		System.out.println(s.isEmpty());          // false
		
		
	}
}