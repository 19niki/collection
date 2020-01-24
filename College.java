package Arraylist;

import java.util.*;
public class College 
{
  ArrayList<Student> stu=new ArrayList<>();
  Scanner s=new Scanner(System.in);
  
  public void addstudent()
  {
	try
	{
	  System.out.println("Enter the id");
	  int id=s.nextInt();
	  System.out.println("enter the name");
	  String name=s.next();
	  System.out.println("Enter the age");
	  int age=s.nextInt();
	  Student obj=new Student(id,name,age);
	  stu.add(obj);
  
  }
  
  catch(Exception e)
	{
	  System.out.println(e);
	}
  }
  public void Studentdetails()
  {
	  for(Student s: stu)
	  {
		  s.details();
	  }
  }
   public void Sortbyname()
   {
	   System.out.println("after sorting");
	   Collections.sort(stu, new Student());
	   Studentdetails();
   }
  public void Sortbyage()
  {
	  System.out.println("age after sorting");
	  Collections.sort(stu, new Sortbyage());
	  Studentdetails();
  }
  
  
  public void Searchstudent()
  {

	  boolean found=false;
	  System.out.println("enter the name of the student to be searched");
	  String name=s.next();
	  for(int i=0; i<stu.size(); i++)
	  {
		  if(stu.get(i).name.equalsIgnoreCase(name))
		  {
			  stu.get(i).details();
			  found=true;
		  }
	  }
	  if(!found)
	  {
		  System.out.println("Student id not found");
	  }
  }
  
  public void Removestudent()
  {
	  boolean found=false;
	  System.out.println("enter the id of the student to be removed");
	  int id=s.nextInt();
	  for(int i=0; i<stu.size(); i++)
	  {
		  if(stu.get(i).id==id)
		  {
			  stu.remove(i).details();
			  System.out.println("Student removed sucessfully");
			  found=true;
		  }
	  }
	  if(!found)
	  {
		  System.out.println("Student id not found");
	  }
  }
	public static void main(String[] args)
	{
	   College c=new College();
	   c.addstudent();
	   c.Studentdetails();
	   c.Sortbyname();
	   c.Sortbyage();
	}

}
