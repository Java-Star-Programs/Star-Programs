import java.util.Scanner;
public class substring {
    
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
        
        substring p=new substring();
        p.display();

}    }
