package Set;
import java.util.*;
public class Trsort {

	public static void main(String[] args) {
		HashSet t=new HashSet();	
Scanner s=new Scanner(System.in);
System.out.println("enter the sting");
String n=s.next();
n=n.replace(" ", "");
for(int i=0; i<n.length();i++)
{
	t.add(n.charAt(i));

	}
System.out.println(t.size());
for( Object o:t)
{
	System.out.println("unique eelements in the string are:"+o);

}

}
}
