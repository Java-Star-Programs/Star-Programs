class Star6
{

void star6()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
if((i+j)==4 || (j==4) || (i+j)==5 || (i+j)==6 ||(i+j==7))
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
Star6 s=new Star6();
s.star6();
}
}

O/P:

    * 
   ** 
  *** 
 **** 
***** 


