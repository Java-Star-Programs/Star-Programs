class Star11
{

void star11()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{

if((j==4)||(i==0) || (i==4) || (j==0) )
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
Star11 s=new Star11();
s.star11();
}
}

O/P:

***** 
*   * 
*   * 
*   * 
***** 



