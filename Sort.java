package Assigment;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  ArrayList a=new ArrayList();
		 a.add(10);
		 a.add(20);
		 a.add(5);
		 System.out.println(a);
		  Collections.sort(a);
		  System.out.println(a);
		  for(Object o:a)
		  {
			  System.out.println("Sorted elements are:"+o);
		  }
       		  
	}

}
