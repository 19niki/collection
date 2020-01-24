package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Sample8 {
	public static void main(String[] args) {

		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
	    h.add(45);
	Iterator il=h.iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	
	System.out.println("Size of the set:"+h.size());
}
}