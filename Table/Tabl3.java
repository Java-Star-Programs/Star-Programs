import java.util.Scanner;

class Tabl3
{

void tabl3()
{
System.out.print("Enter the Number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=2;i<=20;i=i+2)
{
if(n%2==0)
{
System.out.println("Even Number No Table");
break;
}
else
{
System.out.println(n+"*"+i+"="+ n*i);

}
}
}

public static void main(String[]args)
{
Tabl3 t=new Tabl3();
t.tabl3();
}
}

O/P:

Enter the Number: 3
3*2=6
3*4=12
3*6=18
3*8=24
3*10=30
3*12=36
3*14=42
3*16=48
3*18=54
3*20=60

Enter the Number: 2
Even Number No Table


