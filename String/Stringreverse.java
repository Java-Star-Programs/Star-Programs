import java.util.Scanner;

class Stringreverse
{

void display()
{
System.out.println("Enter the Word");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

String rev="";

for(int i=s.length()-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
System.out.println(rev);
}

public static void main(String[]args)
{
Stringreverse s1=new Stringreverse();
s1.display();
}
}

O/P:

Enter the Word

Helloworld
dlrowolleH
