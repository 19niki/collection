package Set;

import java.util.HashSet;

public class Sample6 
{
public static void main(String[] args)
{
	HashSet h=new HashSet();
	h.add(10);
	h.add(20);
	h.add(45);
	System.out.println("elements of set1:"+h);
	HashSet  h1=new HashSet();
	h1.add(10);
	h1.add(47);
	h1.add(78);
	System.out.println("elemets of set2:"+h1);
	h.removeAll(h1);
	System.out.println("elements of set1 after removal:"+h);
	System.out.println("elements of set2:"+h1);
}
}
