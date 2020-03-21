import java.util.*;
class Remove
{
	public static void main(String args[])
	{
		// put
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Chandigarh");
		map.put(4,"Delhi");
		map.put(3,"Goa");
		
		System.out.println(map);     //   {1=Chandigarh, 3=Goa, 4=Delhi}
		
		// remove(key)
		map.remove(3);
		System.out.println(map);    //    {1=Chandigarh, 4=Delhi}
		
		// clear
		map.clear();
		System.out.println(map);   //     {}
			
			
	}
}