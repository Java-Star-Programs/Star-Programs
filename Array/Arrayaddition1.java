class Arrayaddition1
{

void display()
{
int []a={1,2,3,4,5};
int []b={5,6,7,8,9};
int c[]=new int[5];
for(int i=0;i<5;i++)
{
c[i]=a[i]+b[i];

System.out.println(c[i]);
}
}

public static void main(String[]args)
{
Arrayaddition1 a=new Arrayaddition1();
a.display();
}
}
