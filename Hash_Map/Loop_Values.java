import java.util.*;
class Loop_Values
{
	public static void main(String args[])
	{
		
		// put
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Chandigarh");
		map.put(4,"Delhi");
		map.put(3,"Goa");
		
		System.out.println(map);            // {1=Chandigarh, 3=Goa, 4=Delhi}
		
		// Values=to get the data stored in a key
		// String i=as data is of string type
		for (String i : map.values()) 
		{
			System.out.print(i+" ");   // Chandigarh Goa Delhi
                }
	
		
		
		
	}
}