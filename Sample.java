package Set;

import java.util.*;

public class Sample {

	public static void main(String[] args) 
	{
	   HashSet h=new HashSet();	
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the number of elements");
	   int n=s.nextInt();
	   System.out.println("enter the elements");
	   for(int i=0; i<n; i++)
	   {
		   h.add(s.nextInt());
	   }
      System.out.println(h);
      System.out.println(h.size());
	}

}
