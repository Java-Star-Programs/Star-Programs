import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=0;
		while(n!=0)
		{
			int t=n%10;
			temp=temp*10+t;
			n=n/10;
			
		}
		
		System.out.println(temp);
		}
}

O/P:

Enter the Number
121
121

