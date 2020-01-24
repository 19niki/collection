package Arraylist;

import java.util.*;

public class CollegeDriver {
 
	
	public static void main(String[] args)
	{
		 Scanner s=new Scanner(System.in);
		 College c=new College();
		 boolean cont=true;
		 do {
		 System.out.println("1.to add student");
		 System.out.println("2.to dispaly student");
		 System.out.println("3.to sort the students by name");
		 System.out.println("4.to sort the students by age");
		 System.out.println("5.to search the student");
		 System.out.println("6.to remove the student");
		 System.out.println("7.to exit");
		 System.out.println("enter your choice");
		 int ch=s.nextInt();
		 switch(ch)
		 {
		 case 1:
		 {
			 c.addstudent();
			 System.out.println("student added sucessfully");
			 break;
		 }
		 case 2:
		 {
			 c.Studentdetails();
			 break;
		 }
		 case 3:
		 {
			 c.Sortbyname();
			 break;
		 }
		 case 4:
		 {
			 c.Sortbyage();
			 break;
			 
		 }
		 case 5:
		 {
			 c.Searchstudent();
			 break;
		 }
		 case 6:
		 {
			 c.Removestudent();
			 break;
		 }
		 
		 case 7:
		 {
			 System.out.println("get out");
			 break;
		 }
	}
	}
		 while(cont);
}
}