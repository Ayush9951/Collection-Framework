import java.util.*;
class Get
{
	public static void main(String args[])
	{
		// put
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"Chandigarh");
		map.put(4,"Delhi");
		map.put(3,"Goa");
		
		System.out.println(map); // {1=Chandigarh, 3=Goa, 4=Delhi}
		
		// get(key)
		/* if no key is present then hashMap stores null*/
		System.out.println(map.get(0));  //null 
			
		System.out.println(map.get(3));  // Goa
					
	}
}