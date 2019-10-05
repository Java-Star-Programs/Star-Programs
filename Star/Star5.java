class Star5
{

void star5()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=8;j++)
{
if((i+j)==4 || ((i+j)==6)&&(j!=6) || (i==2)&&(j==6) || (i==3)&&(j==5) || (i==4)&&(j==4)||(i==3)&&(j==7) || (i==4)&&(j==6) || (i==4)&&(j==8)) 
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
   * *    
  * * *   
 * * * *  
* * * * *   
