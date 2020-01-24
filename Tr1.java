package Set;
import java.util.*;
public class Tr1 {

	public static void main(String[] args) 
	{
	TreeSet t=new TreeSet();
	t.add(78);
	t.add(20);
	t.add(12);
	t.add(20);
	for(Object o: t)
	{
	System.out.println(o);
	
   }
	System.out.println("===================");
	Iterator il=t.descendingIterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	}

}
