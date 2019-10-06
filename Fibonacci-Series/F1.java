class F1
{

void f1()
{
int a1=0;
int a2=1;

System.out.print(a1+"\t");
System.out.print(a2+"\t");

for(int i=0;i<=10;i++)
{
int a3=a1+a2;
System.out.print(a3+"\t");
a1=a2;
a2=a3;

}
}

public static void main(String[]args)
{
F1 f=new F1();
f.f1();
}
}

