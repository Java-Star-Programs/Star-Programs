class Star18
{

void star18()
{
for(int i=0;i<=9;i++)
{
for(int j=0;j<=9;j++)
{

if((i==0) || (i==9) || (i+j)==4 || (i+j)==1 || (i+j)==2 || (i+j)==3 || (j-i)==-6 || (j-i)==-7 || (j-i)==-5 || (j-i)==-8 || (j-i)==5 || (j-i)==6 || (j-i)==7 || (j-i)==8 || (j-i)==5 || (j-i)==6 || (j-i)==7 || (j-i)==4 || (i+j)==14 || (i+j)==15 || (i+j)==16 || (i+j)==17  )
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
Star18 s=new Star18();
s.star18();
}
}

O/P:

********** 
**** ***** 
***   **** 
**     *** 
*       ** 
*        * 
**      ** 
***    *** 
****  **** 
********** 







