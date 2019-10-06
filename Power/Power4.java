import java.util.Scanner;

//Squres of Even Numbers

class Power4
{

void power4()
{
int c=0;
System.out.print("Up to Numbers: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=n;i=i+2)
{
c=(int)Math.pow(i,2);
System.out.print(c+" \t");
}
}

public static void main(String[]args)
{
Power4 p=new Power4();
p.power4();
}
}

O/P:

Up to Numbers: 20
1 	9 	25 	49 	81 	121 	169 	225 	289 	361 	



