import java.util.Scanner;

class Power2
{

void power2()
{
int b=0;

System.out.print("Up to Numbers: ");
Scanner s=new Scanner(System.in);
int n=s.nextInt();

for(int i=1;i<=n;i++)
{
b=(int)Math.pow(i,3);
System.out.print(b+"\t"+"+  ");
}
}

public static void main(String[]args)
{
Power2 p=new Power2();
p.power2();
}
}

O/P:

Up to Numbers: 10
1	+  8	+  27	+  64	+  125	+  216	+  343	+  512	+  729	+  1000 




