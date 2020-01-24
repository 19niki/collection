package Set;

import java.util.TreeSet;

public class Tr2 
{
	public static void main(String[] args) 
	{
	TreeSet t=new TreeSet();
	t.add(78);
	t.add(20);
	t.add(12);
	t.add('z');
	t.add('z');// class cast exception two types are not allowed
	System.out.println(t);
	}
}
