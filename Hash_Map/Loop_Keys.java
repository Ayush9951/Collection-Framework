import java.util.*;
class Loop_Keys
{
	public static void main(String args[])
	{
		/*  HashMap<key,data>	      */
		/*  only unique keys allowed  */
		/*  no order is maintained    */
		
		// put
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Chandigarh");
		map.put(4,"Delhi");
		map.put(3,"Goa");
		
		System.out.println(map);      // {1=Chandigarh, 3=Goa, 4=Delhi}
		
		// keySet= to get the keys
		for (Integer i : map.keySet()) 
		{
		  System.out.print(i+" ");    // 1,3,4 
       	        }
		
		System.out.println();
		
		for (Integer i : map.keySet()) 
		{								   // key = 1  data = Chandigarh 
			System.out.println("key = "+i+" "+" data = "+map.get(i));  // key = 3  data = Goa  
								                   // key = 4  data = Delhi																
                }
				
	}
}