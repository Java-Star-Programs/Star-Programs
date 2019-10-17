
public class Stringlist {

	
	
	void display()
	{
		String name1="Java return keyword is used to complete the execution of a method. The return followed by the appropriate value that is returned to the caller. This value depends on the method return type like int method always return an integer value.";
		System.out.println("Length of the String  "+name1.length());
		System.out.println(" ");
		System.out.println("Uppercase  "+name1.toUpperCase());
		System.out.println(" ");
		System.out.println("lowercase  "+name1.toLowerCase());
		System.out.println(" ");
		System.out.println("Starts with string   "+name1.startsWith("J"));
		System.out.println(" ");
		System.out.println("Ends with String   "+name1.endsWith("e"));
		System.out.println(" ");
		System.out.println("Char at method of string  "+name1.charAt(100));
		System.out.println(" ");
		System.out.println("Index of the String  "+name1.indexOf("e"));
		System.out.println(" ");
                System.out.println(name1.trim());
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stringlist s=new Stringlist();
		s.display();
		
	}

}
