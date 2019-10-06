class Star16
{

void star16()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{

if(i==0 || (i==2)&&(j==4) || (i+j)==7 || (i==1)&&(j==4) || (i==1)&&(j==1) ||(i==2)&&(j==1) || (i==3)&&(j==2))
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
Star16 s=new Star16();
s.star16();
}
}

O/P:

***** 
 *  * 
 *  * 
  * * 
   *  


