import java.util.*;
class ArrayList_Iterator
{
   	public static void main(String args[])
   	{
        	ArrayList<Integer> list=new ArrayList<>();
        	list.add(1);
        	list.add(2);
        	list.add(3);
        	list.add(8);
        	list.add(5);
        	System.out.println(list);              /*  [1,2,3,8,5]  */
        
        	Iterator<Integer> obj=list.iterator();
       		while(obj.hasNext())
       		{
                   System.out.print(obj.next()+" ");   /*  1 2 3 8 5    */
        	}

	}
}