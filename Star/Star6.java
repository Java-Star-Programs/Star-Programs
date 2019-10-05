class Star6
{

void star6()
{
for(int i=0;i<=3;i++)
{
for(int j=0;j<=6;j++)
{
if((j==3) || (i==3) || (i==1)&&(j==2) || (i==1)&&(j==4)|| ((i+j)==3)|| ((i+j)==4)&&(j!=4) || (i==2)&&(j==4) || ((i+j)==7)&&(j!=6))
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
  ***   
 *****  
******* 
