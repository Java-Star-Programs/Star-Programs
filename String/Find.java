import java.util.Scanner;

class Find
{

void display()
{
System.out.println("Enter the text");
Scanner sc=new Scanner(System.in);
String text=sc.nextLine();

int cc=0;
int vv=0;

text=text.toLowerCase(); 
for(int i=0;i<text.length();i++)
{
if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u')
{
vv++;
}

else if(text.charAt(i)>='a' && text.charAt(i)<='z')
{
cc++;
}
}
System.out.println("Total Vowels: "+vv);
System.out.println("Total Consonats: "+cc);
}

public static void main(String[]args)
{
Find f=new Find();
f.display();
}
}


