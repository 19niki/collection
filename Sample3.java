package Set;

import java.util.HashSet;

public class Sample3
{
  public static void main(String[] args)
  {
	  HashSet h=new HashSet();
	  h.add("niki");
	  h.add("aiki");
	  h.add("nithu");
	  h.add('a');
	  System.out.println(h.contains("niki"));//true
	  System.out.println(h.contains("nki"));//false
	  System.out.println(h.contains("a"));//false
	for(Object o: h)
	{
		System.out.println(o);
	}
  }
}
