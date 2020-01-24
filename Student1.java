package Set;

import java.util.TreeSet;

public class Student1 implements Comparable
{
String name;
int id;
Student1()
{
}
public Student1(String name, int id) {
	super();
	this.name = name;
	this.id = id;

}
 public String toString()
 {
	 return "name:"+name+"id:"+id;
 }
public boolean equals(Object o)
{
	Student temp=(Student)o;
	return name.equals(temp.name) &&
			id==temp.id;
}
public int hashCode()
{
	int hc=0;
	hc=hc+name.hashCode();
	hc=hc+Integer.valueOf(id).hashCode();
	return hc;
}
@Override
public int compareTo(Object o) {
	Student1 temp=(Student1)o;
	if(this.id==temp.id)
		return 0;
	else if(this.id>temp.id)
	{
		return 1;
	}
	return -1;

}
void details()
{
	System.out.println("id:"+id);
	System.out.println("name:"+name);
}
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
	ts.add(new Student1("niki",75));
	ts.add(new Student1("aiki",55));
	for(Object o: ts)
	{
		System.out.println(o);
	}
	
}

	
}

