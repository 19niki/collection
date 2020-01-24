package Set;

import java.util.HashSet;

public class Sample5 
{
  public static void main(String[] args)
  {
	  HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(45);
		h.remove(20);
		System.out.println(h);
  }
}
