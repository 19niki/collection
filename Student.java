package Set;

import java.util.TreeSet;

public class Student 
{
String name;
int id;
Student()
{
}
public Student(String name, int id) {
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
void details()
{
	System.out.println("id:"+id);
	System.out.println("name:"+name);
}
public static void main(String[] args)
{
	TreeSet ts=new TreeSet();
	ts.add(new Student("niki",45));
	ts.add(new Student("aiki",55));
	
}
	
}

