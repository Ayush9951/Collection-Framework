import java.util.*;
class Contains_Value
{
	public static void main(String args[])
	{
		// put(key,value)
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Chandigarh");
		map.put(4,"Delhi");
		map.put(3,"Goa");
		
		System.out.println(map);      			  // {1=Chandigarh, 3=Goa, 4=Delhi}
		
		// containsValue(value)
		System.out.println(map.containsValue("Goa"));    //  true
		
		System.out.println(map.containsValue("pune"));   //  false
		
	}
}