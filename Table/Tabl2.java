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
System.out.println(n+"*"+i+"="+ n*i);
}
}

public static void main(String[]args)
{
Tabl2 t=new Tabl2();
t.tabl2();
}
}

O/P:

Enter the Number: 4
4*2=8
4*4=16
4*6=24
4*8=32
4*10=40
4*12=48
4*14=56
4*16=64
4*18=72
4*20=80

 
