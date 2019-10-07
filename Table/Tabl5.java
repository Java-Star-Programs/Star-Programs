
class Tabl5
{

void tabl5()
{
System.out.println("Square Table: ");
System.out.println(" ");

for(int i=1;i<=10;i++)
{
for(int j=1;j<=10;j++)
{
if(i==j)
{
System.out.println(i+"*"+j+"="+i*j);
}
}
}
}

public static void main(String[]args)
{
Tabl5 t=new Tabl5();
t.tabl5();
}
}

O/P:

Square Table: 
 
1*1=1
2*2=4
3*3=9
4*4=16
5*5=25
6*6=36
7*7=49
8*8=64
9*9=81
10*10=100




