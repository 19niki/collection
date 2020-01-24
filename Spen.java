package Assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class Spen {

	
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
		  ArrayList<Pen> a=new ArrayList<Pen>();
		  a.add(new Pen(1,"ABC","Blue"));
		  a.add(new Pen(2,"XYZ","Red"));
		  a.add(new Pen(3,"PQR","BLACK"));
		  System.out.println("enter the id of the pen to be searched");
		  int id=s.nextInt();
		  for(int i=0; i<a.size();i++)
		  {
			  if(a.get(i).getPid()==id)
			  {
				  a.get(i).details();
			  }
		  }

	}

}
