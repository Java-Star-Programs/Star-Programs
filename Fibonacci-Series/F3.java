class F3
{
// Fibonacci Series on Odd Numbers

void f3()
{
int a1=3;
int a2=5;
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
F3 f=new F3();
f.f3();
}
}

O/P:

3	 5	8	 13	 21	 34	 55	 89	 144	 233	 377	 610	 987


