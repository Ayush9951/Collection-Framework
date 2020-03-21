import java.util.*;
class Put
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
		
		System.out.println(map);      //   {1=Chandigarh, 3=Goa, 4=Delhi}
		
		map.put(1,"Panchkula");	      /*   we can update the data of a key  */
		System.out.println(map);      //   {1=panchkula, 3=Goa, 4=Delhi}
		
		map.put(2,"panchkula");       /*   two different keys can have same data also */
		System.out.println(map);      //   {1=Panchkula, 2=panchkula, 3=Goa, 4=Delhi}
			
		
	}
}