import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
ArrayList a=new ArrayList();
		
		a.add("Hai");
		a.add("Hello");
		a.add("Welcome");
		
		Iterator i=a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
	}

}
