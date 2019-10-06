class F2
{
// Fibonacci Series on Even Numbers

void f2()
{
int a1=2;
int a2=4;
System.out.print(a1+"\t "+a2+"\t");

for(int i=0;i<=10;i++)
{
int a3=a1+a2;
System.out.print(a3+"\t ");
a1=a2;
a2=a3;
}
}

public static void main(String[]args)
{
F2 f=new F2();
f.f2();
}
}

O/P:

2	 4	6	 10	 16	 26	 42	 68	 110	 178	 288	 466	 754


