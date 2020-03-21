import java.util.ArrayList;
class For_Each_Loop
{
        public static void main(String args[]) 
    	{
          	ArrayList<Integer> list=new ArrayList<>();
        	list.add(1);
        	list.add(2);
        	list.add(3);
        	list.add(8);
       		list.add(5);
        	System.out.println(list);    /*  [1,2,3,8,5]  */  
       	        for(Integer i:list)
       		{
                  System.out.print(i +" ");  /*  1 2 3 8 5  */
        	}

	}
}
