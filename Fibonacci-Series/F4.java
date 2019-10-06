class F4
{
// Fibonacci Series on Odd Numbers

void f4()
{
int a1=0;
int a2=1;
System.out.print(a1+"\t "+a2+"\t");

for(int i=0;i<=10;i++)
{
int a3=a1-a2;
System.out.print(a3+"\t ");
a1=a2;
a2=a3;
}
}

public static void main(String[]args)
{
F4 f=new F4();
f.f4();
}
}

O/P:

0	 1	-1	 2	 -3	 5	 -8	 13	 -21	 34	 -55	 89	 -144



