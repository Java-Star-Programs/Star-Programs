class Number2
{

void number2()
{
for(int i=5;i>=0;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println(" ");
}
}

void number3()
{
System.out.println(" ");
for(int i=5;i>=0;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println(" ");
}
}

public static void main(String[]args)
{
Number2 n=new Number2();
n.number2();
n.number3();
}
}

<<<<<<< HEAD

=======
>>>>>>> 332d735dbe46b2896e5a572a1eb6e87206182d9d
O/P:

55555 
4444 
333 
22 
1 
 
 
12345 
1234 
123 
12 
1 



