
public class Split {

	
	
	void display()
	{
		String name1="Java return keyword is used to complete the execution of a method. The return followed by the appropriate value that is returned to the caller. This value depends on the method return type like int method always return an integer value.";
		String[] obj=name1.split("\\s");
		for(String o:obj)
		{
			System.out.println(o);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Split s=new Split();
		s.display();
		
	}

}
