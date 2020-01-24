package Assigment;

import java.util.*;

public class Psort  {

	public static void main(String[] args)
	{
		ArrayList<Pen> a=new ArrayList<Pen>();
		  a.add(new Pen(2,"ABC","Blue"));
		  a.add(new Pen(1,"XYZ","Red"));
		  a.add(new Pen(3,"PQR","BLACK"));
		  Collections.sort(a);
	 
		   for(int i=0; i<a.size();i++)
		   {
		      a.get(i).details();
		   }
		 

	}

}