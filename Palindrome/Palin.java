import java.util.Scanner;

class Palin
{

void palin()
{

System.out.print("Enter the number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int top=n;

int temp=0;

while(n!=0)
{
int t=n%10;
temp=temp*10+t;
n=n/10;
}
if(top==temp)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}

public static void main(String[]args)
{
Palin p=new Palin();
p.palin();
}
}


O/P:

Enter the number: 343
Palindrome

Enter the number: 4758475
Not Palindrome


