class Star12
{

void star12()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=8;j++)
{

if((i==4)|| (i+j)==4 || (i==1)&&(j==5) || (i==2)&&(j==6) || (i==3)&&(j==7))
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
Star12 s=new Star12();
s.star12();
}
}

O/P:

    *     
   * *    
  *   *   
 *     *  
*********


