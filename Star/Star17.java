class Star17
{

void star17()
{
for(int i=0;i<=8;i++)
{
for(int j=0;j<=8;j++)
{

if(i==4 || (i-j)==0 || (i+j)==8 || (j-i)==7 &&(i!=0) || (j-i)==6 &&(i!=0) || (i==2)&&(j==7) || (i==3)&&(j==6)|| (i==3)&&(j==7) || (i==3)&&(j==8) ||(i==5)&&(j==6) || (i==5)&&(j==7)|| (i==5)&&(j==8) || (i==6)&&(j==7) ||(i==6)&&(j==8) || (i==7)&&(j==8) || (i==7)&&(j==0)||(i+j)==8 || (i==6)&&(j==1) || (i==6)&&(j==0) || (i==5)&&(j==0)||(i==5)&&(j==1)||(i==5)&&(j==2) || (i==3) &&(j==0) || (i==3)&&(j==1) || (i==3)&&(j==2) || (i==2)&&(j==0) || (i==2)&&(j==1) || (i==1)&&(j==0)   )
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
Star17 s=new Star17();
s.star17();
}
}

O/P:

*       * 
**     ** 
***   *** 
**** **** 
********* 
**** **** 
***   *** 
**     ** 
*       * 