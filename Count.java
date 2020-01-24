package Set;
import java.util.*;
public class Count 
{
public static void main(String[] m)
{
	TreeSet laila=new TreeSet();
	laila.add("kitkat");
	laila.add("ecalirs");
	laila.add("candyman");
	laila.add("polo");
	
	TreeSet leela=new TreeSet();
	leela.add("kitkat");
	leela.add("candyman");
	leela.add("coffebit");
	leela.add("mangobit");
	leela.removeAll(laila);
	System.out.println(leela);
	System.out.println(leela.size());
}
}
