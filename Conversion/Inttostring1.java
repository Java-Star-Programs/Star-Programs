import java.util.Scanner;

class Inttostring1
{
void inttostring1()
{
try
{
System.out.print("Enter the number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

String s=String.valueOf(n);
System.out.print("Int to String Conversion: "+s);
}
catch(NumberFormatException e)
{
}
}

public static void main(String[]args)
{
Inttostring1 i=new Inttostring1();
i.inttostring1();
}
}

O/P:

Enter the number: 400
Int to String Conversion: 400



