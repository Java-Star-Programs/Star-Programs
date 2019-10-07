import java.util.Scanner;

class Magic1
{

public static void main(String[]args)
{
System.out.print("Enter the number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int add=sum(n);
int reverse=rev(add);

if((add*reverse)==n)
{
System.out.println("Magic Number");
}
else
{
System.out.println("Not Magic Number");
}

}

public static int sum(int number)
{
int top=0;

while(number!=0)
{
top=top+(number%10);
number=number/10;
}
return top;
}

public static int rev(int number)
{
int pop=0;

while(number!=0)
{
int t=number%10;
pop=(pop*10)+t;
number=number/10;
}
return pop;

}
}

/*"non-static variable cannot be referenced from a static context" is biggest nemesis of some one who has just started programming and that too in Java. Since main method in java is most popular method among all beginners and they try to put program code there they face "non-static variable cannot be referenced from a static context" compiler error when they  try to access a non static member variable inside main in Java which is static. if you want to know
why main is declared static in Java see the link.

why main is declared static in Java see the link.
Read more: https://javarevisited.blogspot.com/2012/02/why-non-static-variable-cannot-be.html#ixzz61f3Lv2p7

*/


O/P:

Enter the number: 1458
Magic Number

Enter the number: 37434
Not Magic Number



