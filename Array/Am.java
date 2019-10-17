class Am
{

void display()
{
int a[]={4,6,8,10,12};
int b[]={2,3,4,5,6};
int c[]=new int[5];

for(int i=0;i<5;i++)
{
c[i]=a[i]/b[i];
System.out.println(c[i]);
}
}

public static void main(String[]args)
{
Am a=new Am();
a.display();
}
}

