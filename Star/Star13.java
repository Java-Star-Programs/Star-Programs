class Star13
{

void star13()
{
for(int i=0;i<=8;i++)
{
for(int j=0;j<=8;j++)
{

if((i+j)==4 || (j-i)==4 || (i-j)==4 || (i+j)==12)
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
Star13 s=new Star13();
s.star13();
}
}

O/P:

    *     
   * *    
  *   *   
 *     *  
*       * 
 *     *  
  *   *   
   * *    
    *  



