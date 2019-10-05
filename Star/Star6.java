class Star6
{

void star6()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=8;j++)
{
if( (i+j)==4 || (i+j)==6 &&(i!=0)&&(j!=6) || (i+j)==8 && (i!=0)&&(j!=8) &&(i!=1)&&(j!=7) || (i+j)==10 && (i!=2)&&(j!=8) || (i+j)==12) 
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
   * *    
  * * *   
 * * * *  
* * * * * 





