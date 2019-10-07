import java.util.Scanner;

class Tabl4
{

void tabl4()
{
System.out.print("Enter the Number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=10;++i)
{
System.out.println(n+"*"+i+"="+n*i);
++n;
}
}

public static void main(String[]args)
{
Tabl4 t=new Tabl4();
t.tabl4();
}
}

O/P:

Enter the Number: 3
3*1=3
4*2=8
5*3=15
6*4=24
7*5=35
8*6=48
9*7=63
10*8=80
11*9=99
12*10=120
