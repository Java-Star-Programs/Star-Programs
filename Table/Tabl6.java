class Tabl6
{

void tabl6()
{
System.out.println("Table: ");
System.out.println(" ");

for(int i=1;i<=10;i++)
{
for(int j=1;j<=10;j++)
{
if((i-j)==-1)
{
System.out.println(i+"*"+j+"="+i*j);
}
}
}
}

public static void main(String[]args)
{
Tabl6 t=new Tabl6();
t.tabl6();
}
}

O/P:

Table: 
 
1*2=2
2*3=6
3*4=12
4*5=20
5*6=30
6*7=42
7*8=56
8*9=72
9*10=90

