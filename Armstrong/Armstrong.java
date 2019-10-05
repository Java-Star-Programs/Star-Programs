import java.util.Scanner;

class Armstrong
{

void armstrong()
{
System.out.print("Enter the number:  ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int top;
top=n;
int temp=0;
while(n!=0)
{
int t=n%10;
temp=temp+t*t*t;
n=n/10;
}

if(temp==top)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}

public static void main(String[]args)
{
Armstrong a=new Armstrong();
a.armstrong();
}
}

O/P:

Enter the number:  153
Armstrong Number
