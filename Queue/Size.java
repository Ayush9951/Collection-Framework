import java.util.*;
class Size
{
	public static void main(String args[])
	{
		// size
		Queue<Integer> q=new LinkedList<>();
		
		System.out.println(q.size());     // 0
		
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.size());	  // 3
		
	}
}