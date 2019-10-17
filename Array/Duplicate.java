class Duplicate
{

void display()
{
int a[]={1,2,2,3,3,4,5,7,8,9,4,6,7,8,9,10,11,12,34,12,11,6,7,8,9,0,0};

for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
System.out.println(a[j]);
}
}
}
}

public static void main(String[]args)
{
Duplicate d=new Duplicate();
d.display();
}
}

