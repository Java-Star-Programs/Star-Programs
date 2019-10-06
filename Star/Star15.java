class Star15
{

void star15()
{
for(int i=0;i<=8;i++)
{
for(int j=0;j<=8;j++)
{

if((j==4)|| (j-i)==4 || (i+j)==12)
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
Star15 s=new Star15();
s.star15();
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




