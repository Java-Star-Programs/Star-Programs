class Star8
{

void star8()
{
for(int i=0;i<=4;i++)
{
for(int j=0;j<=4;j++)
{
if( (i+j)==4 || (i+j)==5 || (i+j)==6 || (i+j)==7 || (i+j)==8)
{
System.out.print("🏃");
}
else
{
System.out.print(" ");
}
}
System.out.println(" ");
}
}

public static void main(String[]args)
{
Star8 s=new Star8();
s.star8();
}
}

O/P:

    🏃 
   🏃🏃 
  🏃🏃🏃 
 🏃🏃🏃🏃 
🏃🏃🏃🏃🏃 

 
