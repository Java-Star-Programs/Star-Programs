class Star19
{

void star19()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{

if(  (i==4) || (i-j)==0 || (i+j)==0 || (i==1)&&(j==0) || (i==2)&&(j==0) || (i==3)&&(j==0)  )
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
Star19 s=new Star19();
s.star19();
}
}

O/P:

*     
**    
* *   
*  *  
***** 




