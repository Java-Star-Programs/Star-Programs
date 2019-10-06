import java.util.Scanner;

//Squres of Even Numbers

class Power5
{

void power5()
{
int c=0;
System.out.print("Up to Numbers: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=2;i<=n;i=i+2)
{
c=(int)Math.pow(i,2);
System.out.print(c+" \t");
}
}

public static void main(String[]args)
{
Power5 p=new Power5();
p.power5();
}
}

Up to Numbers: 10
4 	16 	36 	64 	100 


