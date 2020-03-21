import java.util.*;
public class Add_All
{
	public static void main(String args[])
	{
		
		/* adding a second Array list at the end of first Array list   */
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(14);
		list1.add(15);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(17);
		list2.add(18);
		
		list1.addAll(list2);
		System.out.println(list1+"\n");   /*    [14,15,17,18]	   */
		
		
		/* adding a second Array list at a specific position in the first Array list   */
		
	        ArrayList<Integer> list3=new ArrayList<>();
		list3.add(11);
		list3.add(12);
		list3.add(13);
		
		ArrayList<Integer> list4=new ArrayList<>();
		list4.add(25);
		list4.add(27);
		   
		list3.addAll(3,list4);            /*  we can add an element at a position which can be equal to the size of ArrayList also  */
		System.out.println(list3+"\n");   /*   [11,12,13,25,27]	   */

	
	}
}