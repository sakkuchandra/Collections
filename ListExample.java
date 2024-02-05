import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ListExample 
{
	ArrayList list;
	
	public void CreateList()
	{
		list=new ArrayList();
		list.add(10);  //given value converts as object
		list.add(20);               //that process is known as autoboxing
		list.add(30);
		list.add(10);
		list.add("java");
		list.add(12.4f);
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}  
	public void CreateVector()
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(10);
		v.add("java");
		v.add(12.4f);
		
		Iterator i=v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String args[])
	{
		ListExample li=new ListExample();
		//li.CreateList();
		li.CreateVector();
	}
	

}
