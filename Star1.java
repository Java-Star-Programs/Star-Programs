class Star1
{
void star1()
{
for(int i=0;i<=5;i++)
{
for(int j=0;j<=5;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
}
void star2()
{
System.out.println(" ");
for(int i=0;i<=5;i++)
{
for(int j=0;j<=5;j++)
{
System.out.print(j);
}
System.out.println(" ");
}
}

public static void main(String[]args)
{
Star1 s=new Star1();
s.star1();
s.star2();
}
}


O/P:

000000 
111111 
222222 
333333 
444444 
555555 
 
012345 
012345 
012345 
012345 
012345 
012345 
