package Assigment;
import java.util.*;
public class Box1 {

	public static void main(String[] args) 
	{
		ArrayList<Marker> a=new ArrayList<Marker>();
		Scanner s=new Scanner(System.in);
		try
		{
		for(int j=0; j<3; j++)
		{
		System.out.println("enter the markerid");
		int id=s.nextInt();
		System.out.println("eneter the marker color");
		String color=s.next();
		System.out.println("enter the maker price");
		int price=s.nextInt();
		a.add(new Marker(id,color,price));
		}
		}
		catch(Exception e)
		{
		System.out.println("exception");	
		}
		
		/*a.add(new Marker(1,"green",20));
		a.add(new Marker(2,"red", 20));
		a.add(new Marker(3,"blue",45));*/
	   ListIterator<Marker> il=a.listIterator();
	   System.out.println("before sorting");
		for(int i=0; i<a.size(); i++)
		{
		  a.get(i).details();
		}
		boolean cfound=false;
		boolean ifound=false;
		boolean rfound=false;
		// to search a string element
		System.out.println("enter the color  to be searched");
		String name=s.next();
		for(int i=0; i<a.size(); i++)
		{
			if(a.get(i).getColor().equalsIgnoreCase(name))
			{
				cfound=true;
				a.get(i).details();
			}
		}
		if(!cfound)
		{
			System.out.println("element not found");
		}
		
		// to search using the integer
		System.out.println("enter the id to be searched");
		int n=s.nextInt();
		for(int i=0; i<a.size(); i++)
		{
			if(a.get(i).getId()==(n))
			{
				ifound=true;
				a.get(i).details();
			}
		}
		if(!ifound)
		{
			System.out.println("element not found");
		}
		
		// to count the objects
		System.out.println("enter the element to be count with the particular price");
		int price=s.nextInt();
		int count=0;
		while(il.hasNext())
		{
			Marker temp=il.next();
			if(temp.getPrice()==price)
			{
				count++;
			}
		}
		System.out.println("number of marker present with: "+price+ " are: "+count);
		
		// to sort the objects
		System.out.println("after sorting");
		Collections.sort(a);
		  for(int i=0; i<a.size();i++)
		   {
		      a.get(i).details();
		   }	
		
		  // To remove the objcerts from the array list
		  System.out.println("enter the id of the element to be removed");
		  int id=s.nextInt();
		  for(int i=0; i<a.size(); i++)
		  {
			  if(a.get(i).getId()==(id))
			  {
				  rfound=true;
				  a.remove(i);
				  a.get(i).details();
			  }
		  }
		  
		  System.out.println("removed element is:"+id);
		 
		  if(!rfound)
		  {
			  System.out.println("marker not found");
		  }
		  
		/*while(il.hasPrevious())
		{
			System.out.println(il.previous());
		}*/
	}

}
