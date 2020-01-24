package Set;
import java.util.*;
public class Sample1 {

	public static void main(String[] args)
	{
	   TreeSet s=new TreeSet();
	   s.add(10);
	   s.add(45);
	   s.add(78);
	   s.add(45);
	   System.out.println(s);
	    Object[] a=s.toArray();
	    for(int i=0; i<a.length; i++)
	    {
	    	System.out.println(a[i]);
	    }
	}

}
