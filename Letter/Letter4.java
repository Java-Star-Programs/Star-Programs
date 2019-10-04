class Letter4
{

void letter4()
{
for(char a='E';a>='A';a--)
{
for(char b='A';b<=a;b++)
{
System.out.print(a);
}
System.out.println(" ");
}
}

void letter5()
{
System.out.println(" ");
for(char a='E';a>='A';a--)
{
for(char b='A';b<=a;b++)
{
System.out.print(b);
}
System.out.println(" ");
}
}

public static void main(String[]args)
{
Letter4 l=new Letter4();
l.letter4();
l.letter5();
}
}

O/P:

EEEEE 
DDDD 
CCC 
BB 
A 
 
ABCDE 
ABCD 
ABC 
AB 
A 
