class Star14
{

void star14()
{
for(int i=0;i<=8;i++)
{
for(int j=0;j<=8;j++)
{

if((i+j)==4 || (i-j)==4 || (j==4))
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
Star14 s=new Star14();
s.star14();
}
}

O/P:

    *     
   **     
  * *     
 *  *     
*   *     
 *  *     
  * *     
   **     
    * 



