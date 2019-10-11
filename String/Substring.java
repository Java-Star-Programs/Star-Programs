import java.util.Scanner;
public class Substring {
    
    void display()
    {
        System.out.println("Enter the word");                                                       
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        int start=sc.nextInt();
        int end=sc.nextInt();
        
        System.out.println(s.substring(start, end));
        
    }
    
    
    public static void main(String[] args) {
        
        Substring p=new Substring();
        p.display();

}    }

O/P:

Enter the word
hello
0
3
hel
