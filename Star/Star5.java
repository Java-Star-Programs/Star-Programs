class Star5
{

void star5()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=6;j++)
{
if((i==0)&&(j==3) || (i==3) || (i==2)&&(j!=0)&&(j!=6) || (i==1)&&(j!=0)&&(j!=1)&&(j!=5)&&(j!=6)  )
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
Star5 s=new Star5();
s.star5();
}
}


O/P:

   *    
  ***   
 *****  
******* 



