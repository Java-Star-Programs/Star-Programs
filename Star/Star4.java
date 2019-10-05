class Star4
{

void star4()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
if((i==j) || (i+j)==4)
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
Star4 s=new Star4();
s.star4();
}
}

O/P:

*   * 
 * *  
  *   
 * *  
*   * 



