class Letter3
{

void letter3()
{
for(char a='E';a>='A';a--)
{
for(char b='E';b>='A';b--)
{
System.out.print(a);
}
System.out.println(" ");
}
}

void letter4()
{
System.out.println(" ");
for(char a='E';a>='A';a--)
{
for(char b='E';b>='A';b--)
{
System.out.print(b);
}
System.out.println(" ");
}
}


public static void main(String[]args)
{
Letter3 l=new Letter3();
l.letter3();
l.letter4();
}
}

O/P:

EEEEE 
DDDDD 
CCCCC 
BBBBB 
AAAAA 
 
EDCBA 
EDCBA 
EDCBA 
EDCBA 
EDCBA 
