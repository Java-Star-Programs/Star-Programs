import java.util.Scanner;

class Cal
{
void cal()
{
System.out.print("Enter a Year:  ");
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();

if(year%4==0)
{
System.out.println("Leap Year");
}
else
{
System.out.println("Non Leap Year");
}
}

public static void main(String[]args)
{
Cal c=new Cal();
c.cal();
}
}

