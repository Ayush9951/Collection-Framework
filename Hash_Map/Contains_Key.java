import java.util.*;
class Contains_Key
{
	public static void main(String args[])
	{
		// put(key,value)
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Chandigarh");
		map.put(4,"Delhi");
		map.put(3,"Goa");
		
		System.out.println(map);		 // {1=Chandigarh, 3=Goa, 4=Delhi}
		
		// containsKey(key)	
		System.out.println(map.containsKey(4));  //  true

		System.out.println(map.containsKey(7));  //  false
		
	}
}