package bookmytickets;

import java.util.Scanner;

public class Book {

private static int d=0;
private static boolean Mainmenu= true;
private static boolean Submenu= true;
public static int tickets=100;
public static Scanner s=new Scanner(System.in);
private static int n=0;
private static int f=0;

public static void book(int n,int d)
{
	System.out.println(" ");
	System.out.println(" ");
	System.out.print("Enter the tickets: ");
	n=s.nextInt();
	System.out.println(n  +" tickets are booked");
	System.out.println(" ");
	System.out.println(" ");
	
	d=tickets-n;
	System.out.println("Remaing Tickets: "+d);
}
	
public static void cancel(int c,int d,int f)
{
	System.out.print("Enter cancel tickets: ");
	c=s.nextInt();
	f=d+c;
	System.out.println(c +" Tickets are cancelled");
	System.out.println("Total tickets "+f);
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(Mainmenu)
		{
			while(Submenu)
			{
				System.out.println(" Welcome to Bookmymovie ");
                System.out.println(" ");
                System.out.println("B: Book a ticket");
                System.out.println(" ");
                System.out.println("C: cancel ticket ");
                System.out.println("  ");
                System.out.println(" ");
				
                Scanner sc=new Scanner(System.in);
                String select=sc.next();
                
                switch(select)
                {
                case "B":
                        book(n,d);            	
                	break;
                	
                	
                case "C":
                	cancel(d,n,f);
                
                break;
                }
                
                System.out.println(" ");
                System.out.println("Would like to start another option \n1 Yes  \n2 No");
                System.out.println(" ");
                System.out.println(" ");
                
                if(sc.nextInt()==1)
                {
                	Submenu=true;
                }
                else
                {
                	Submenu=false;
                }
                Submenu=true;
                
                System.out.println(" ");
                System.out.println("Would like continue another program\n1 Yes  \n2 No");
                
                if(sc.nextInt()==1)
                {
                	Mainmenu=true;
                }
                else
                {
                	System.out.println(" ");
                	System.exit(0);
                }
                
			}
		}
	}

}
