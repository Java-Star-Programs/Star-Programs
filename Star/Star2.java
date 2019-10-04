class Star2
{
void star2()
{
for(int i=5;i>=0;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
public static void main(String[]args)
{
Star2 s=new Star2();
s.star2();
}
}

O/P:

***** 
**** 
*** 
** 
* 



