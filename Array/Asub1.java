class Asub1
{

void display()
{
int a[]={9,8,7,6,5,4};
int b[]={1,2,3,4,5,6};
int c[]=new int[6];

for(int i=0;i<6;i++)
{
c[i]=a[i]-b[i];
System.out.println(c[i]);
}
}

public static void main(String[]args)
{
Asub1 a=new Asub1();
a.display();
}
}

