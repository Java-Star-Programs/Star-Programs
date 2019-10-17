import java.io.*;
import java.util.*;

public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
           scan.close();
        s=s.trim();
          
       
       if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
       
        
    }
}
}
