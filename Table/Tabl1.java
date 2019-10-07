import java.util.Scanner;

class Tabl1
{

void table()
{
System.out.print("Enter the number: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"= "+n*i);
}
}

public static void main(String[]args)
{
Tabl1 t=new Tabl1();
t.table();
}
}

O/P:

Enter the number: 5
5*1= 5
5*2= 10
5*3= 15
5*4= 20
5*5= 25
5*6= 30
5*7= 35
5*8= 40
5*9= 45
5*10= 50


