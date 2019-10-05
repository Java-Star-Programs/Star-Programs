class Star3
{

void star3()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
if((i==2) || (j==2))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}

}
System.out.println(" ");
}
}

public static void main(String[]args)
{
Star3 s=new Star3();
s.star3();
}
}

O/P:

  *   
  *   
***** 
  *   
  *   


