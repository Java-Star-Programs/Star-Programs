import java.util.Scanner;

class Power1
{

void power1()
{
int a=0;
System.out.print("Up to Numbers ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
a=a+(int)Math.pow(i,2);
}

System.out.print("Squares of numbers: " +a);
}

public static void main(String[]args)
{
Power1 p=new Power1();
p.power1();
}
}


O/P:

Up to Numbers 100
Squares of numbers: 338350
