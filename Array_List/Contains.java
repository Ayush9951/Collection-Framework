import java.util.*;
class Contains
{
	public static void main(String args[])
	{
		// Time Complexity:- O(n) linear time
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
       	        list.add(2);
                list.add(3);
                list.add(4);
                list.add(5);
         	System.out.println(list+"\n");              /*  [1,2,3,4,5]  */
		
		// contains(data) : return 'true' or 'false' 
		
		System.out.println(list.contains(5)+"\n");  // true
		System.out.println(list.contains(7)+"\n");  // false
	
		
	}
}