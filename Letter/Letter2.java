class Letter2
{

void letter2()
{
for(char a='A';a<='E';a++)
{
for(char b='A';b<=a;b++)
{
System.out.print(b);
}
System.out.println(" ");
}
}

void letter3()
{
System.out.println(" ");
for(char a='A';a<='E';a++)
{
for(char b='A';b<=a;b++)
{
System.out.print(a);
}
System.out.println(" ");
}
}


public static void main(String[]args)
{
Letter2 l=new Letter2();
l.letter2();
l.letter3();
}
}

O/P:

A 
AB 
ABC 
ABCD 
ABCDE 
 
A 
BB 
CCC 
DDDD 
EEEEE 


