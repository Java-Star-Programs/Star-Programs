class Star7
{

void star7()
{
for(int i=0;i<=3;i++)
{
for(int j=0;j<=3;j++)
{
if((i==2) || ((i+j)==1) || ((i+j)==2)&&(j!=1) || ((i+j)==4)&&(j!=1) || ((i+j)==6) || (i==3)&&(j==0))
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
Star7 s=new Star7();
s.star7();
}
}

O/P:

 **  
*  * 
**** 
*  * 


