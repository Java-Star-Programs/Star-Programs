class Star10
{ 

void star10()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
if( (j-i)==3&&(i!=1)&&(j!=4) || (i==2)&&(j==2) || (i==2)&&(j==4) || (i==3)&&(j==2) || (i==3)&&(j==4) )
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
Star10 s=new Star10();
s.star10();
}
}

O/P Letter A :

   *

  * *
  * *

