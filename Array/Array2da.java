class Array2da
{

void display()
{
int a[][]={{40,50,60,70,80},{100,110,120,130,140}};
int b[][]={{100,200,300,400,500},{1000,2000,3000,4000,5000}};

int c[][]=new int[2][5];

for(int i=0;i<2;i++)
{
for(int j=0;j<5;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]);
}
}
}

public static void main(String[]args)
{
Array2da a=new Array2da();
a.display();
}
}

