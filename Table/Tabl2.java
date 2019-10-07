import java.util.Scanner;

class Tabl2
{

void tabl2()
{
System.out.print("Enter the Number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=2;i<=20;i=i+2)
{
if(n%2==0)
{
System.out.println(n+"*"+i+"="+ n*i);
}
else
{
System.out.println("Odd Number No Table");
break;
}
}
}

public static void main(String[]args)
{
Tabl2 t=new Tabl2();
t.tabl2();
}
}

O/P:

Enter the Number: 232323
Odd Number No Table

Enter the Number: 32
32*2=64
32*4=128
32*6=192
32*8=256
32*10=320
32*12=384
32*14=448
32*16=512
32*18=576
32*20=640

 
