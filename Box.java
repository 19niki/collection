package Arraylist;
import java.util.*;
public class Box
{
ArrayList<Pen> a=new ArrayList<>();
Scanner s=new Scanner(System.in);

boolean cfound=false;
		public void addPen() 
		{
			for(int i=0; i<3;i++)
			{
			System.out.println("enter the penid");
			int id=s.nextInt();
			System.out.println("enter the pen name");
			String name=s.next();
			System.out.println("enter the pen color");
			String color=s.next();
			Pen p=new Pen(id, name, color);
			a.add(p);
		}
		}
		public void Toserach()
		{
			System.out.println("enter the color of the pen");
			String color=s.next();
			for(int i=0;i<a.size(); i++)
			{
				if(a.get(i).color.equalsIgnoreCase(color))
                 {
	        a.get(i).details();
                }
			}
			if(!cfound)
			{
				System.out.println("color not found");
			}
		}
		public void Toremove()
		{
			try
			{
			System.out.println("enter the penid to be removed");
			int id=s.nextInt();
			for(int i=0;i<a.size(); i++)
			{
				if(a.get(i).id==id)
                 {
	                a.remove(i);
	                a.get(i).details();
	                cfound=true;
                }
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			
			}
			if(!cfound)
			{
				System.out.println("color not found");
			}
		}
		public void Tocount()
		{
			int count=0;
			System.out.println("enter the color of the pen to be counted");
			String color=s.next();
			Iterator<Pen> il=a.iterator();
			while(il.hasNext()) 
			{
			    Pen temp=il.next();
			    if(temp.color.equals(color))
			    {
			    	count++;
			    }
			}
			System.out.println("numbers of pen with of particular color are:"+count);
		}
		
		public void Sort()
		{
			System.out.println("after sorting");
			Collections.sort(a);
			Displaydetails();
		}
		public void Displaydetails()
		{
			for(Pen p:a)
			{
				p.details();
			}
		}
		
		public static void main(String[] args) 
		{
			Box b=new Box();
			b.addPen();
			b.Displaydetails();
			b.Toserach();
			b.Toremove();
			b.Tocount();
			b.Sort();
	}
}
