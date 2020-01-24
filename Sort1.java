package Set;

import java.util.HashSet;
import java.util.Scanner;

public class Sort1 
{
	public static void main(String[] args)
	{
	HashSet t=new HashSet();	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the sting");
	String n=s.next();
	n=n.toLowerCase();
	for(int i=0; i<n.length(); i++)
	{
		t.add(n.charAt(i));
	}
	System.out.println("number of the unique elements are:"+t.size());
	for(Object o: t)
	{
		System.out.println("unique elemets are:"+o);
	}
	}
}
