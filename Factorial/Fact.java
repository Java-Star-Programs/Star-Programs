
import java.util.Scanner;


class Fact
{

void fact()
{
int fact=1;

System.out.print("Enter the Number:  ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<n;i++)
{
fact=fact*i;
}
System.out.print("Factorial of Number "+n+ " is: " +fact+"\t");
}

public static void main(String[]args)
{
Fact f=new Fact();
f.fact();
}
}

O/P:

Enter the Number:  10
Factorial of Number 10 is: 362880
