package Assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class Rpen 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	  ArrayList<Pen> a=new ArrayList<Pen>();
	  a.add(new Pen(1,"ABC","Blue"));
	  a.add(new Pen(2,"XYZ","Red"));
	  a.add(new Pen(3,"PQR","BLACK"));
	  System.out.println("enter the name of the pen to be removed");
	  String name=s.next();
	  boolean found=false;
	  for(int i=0; i<a.size();i++)
	  {
		  if(a.get(i).getName().equalsIgnoreCase(name))
		  {
			  a.remove(i);
			  found=true;
			  System.out.println("book removed is:"+ name);
		  }
		 
	  }
	  if(!found)
	  {
		  System.out.println("Book is not found:");
	  }
	  
		  for(int i=0;i<a.size();i++)
		   {
			   a.get(i).details();
		   }
	  }
	
}
