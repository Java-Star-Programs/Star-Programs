import java.util.Scanner;

class Power3
{

void power3()
{
int a=0;

System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
a=(int)Math.pow(i,i)/(int)(i);
System.out.print(a+" \t");
}

}

public static void main(String[]args)
{
Power3 p=new Power3();
p.power3();
}
}

O/P:

Enter the number: 
5
1 	2 	9 	64 	625

1^1/1 + 2^2/2 + 3^3/3 + 4^4/4 + 5^5/5 
