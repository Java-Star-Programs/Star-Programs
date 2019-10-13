
import java.util.Scanner;

class Count
{

void display()
{
int flag=0;

System.out.println("Enter the text");
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();

for(int i=0;i<name.length();i++)
{
if(name.charAt(i) != ' ')
{
flag++;
}
}
System.out.println("Total Number of characters in a string: "+flag);
}

public static void main(String[]args)
{
Count c=new Count();
c.display();
}
}

O/P:

Enter the text
Welcome to Delhi                                       
Total Number of characters in a string: 14


