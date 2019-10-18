import java.util.Scanner;

public class Search {

	void display()
	{
		String a[]= {"Hai","Hello"};
		String n="Hello";
		int flag=0,i;
		for(i=0;i<a.length;i++)
		{
		if(a[i]==n)
		{
			flag=i+1;
			break;
		}
		else
		{
			flag=0;
		}
		}
		
		if(flag!=0)
		{
			System.out.println(i+1);
		}
		else
		{
			System.out.println("Element Not found");
		}
		
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Search s=new Search();
		s.display();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}



