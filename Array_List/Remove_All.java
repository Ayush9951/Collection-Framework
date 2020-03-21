import java.util.*;
public class Remove_All
{
	public static void main(String args[])
	{
		//  remove 
		ArrayList<Integer> list1=new ArrayList<>();
                list1.add(10);
                list1.add(20);
                list1.add(30);
		ArrayList<Integer> list2=new ArrayList<>();
                list2.add(40);
       		list2.add(50);
		
		//  addAll
		list1.addAll(list2);
		System.out.println(list1);      /* [10,20,30,40,50]  */
		
	        //  removeAll
		list1.removeAll(list2);
		System.out.println(list1);	/* [10,20,30]  */
		
	
		
	}
}