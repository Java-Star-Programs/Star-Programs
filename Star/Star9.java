class Star9
{

void star9()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
if( (i+j)==0 || (i+j)==8 || (j-i)==4 || (i==4)&&(j==0) || (i==2)&&(j==2))
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
Star9 s=new Star9();
s.star9();
}
}

O/P:

*   * 
      
  *   
      
*   * 
