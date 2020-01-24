package Arraylist;

import java.util.*;

public class Driverpen 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String [] args)
    {
    Box b=new Box();
    boolean cont=true;
    do
    {
    	System.out.println("1:to add student");
    	System.out.println("2:to display student details");
    	System.out.println("3:to serach the student");
    	System.out.println("4:to remove the student");
    	System.out.println("5: to sort the student");
    	System.out.println("6. to exit");
    	int choice=s.nextInt();
    	switch(choice)
    	{
    	case 1:
    	{
    		b.addPen();
    		System.out.println("Pen added sucessfully");
    	}
    	break;
    	case 2:
    	{
    		b.Displaydetails();
    	}
    	break;
    	case 3:
    	{
    		b.Toserach();
    	}
    	break;
    	case 4:
    	{
    		b.Toremove();
    	}
    	break;
    	case 5:
    	{
    		b.Sort();
    	}
    	break;
    	case 6:
    	{
    		System.out.println("thank you for using");
    		cont=false;
    	}
    		break;
    		default:
    			System.out.println("invalid option");
    }
    }
    	while(cont);
    
    }
}