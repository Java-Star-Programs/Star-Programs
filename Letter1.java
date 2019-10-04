class Letter1
{
void letter1()
{
for(char a='A';a<='E';a++)
{
for(char b='A';b<='E';b++)
{
System.out.print(a);
}
System.out.println(" ");
}
}

void letter2()
{
System.out.println(" ");
for(char a='A';a<='E';a++)
{
for(char b='A';b<='E';b++)
{
System.out.print(b);
}
System.out.println(" ");
}
}

public static void main(String[]args)
{
Letter1 l=new Letter1();
l.letter1();
l.letter2();
}
}

