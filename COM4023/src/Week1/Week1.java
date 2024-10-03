package Week1;

import java.util.Scanner;

/**
 *
 * @author Andrew Stephenson
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Exercise 1
        System.out.println("Hello World");
        
        // Exercise 2
       Scanner reader = new Scanner(System.in);
       String name=reader.nextLine();
       System.out.println("Your name was "+ name);
       
       // Exercise 3
       int length, height;
       System.out.println("Enter Length:");
       name=reader.nextLine();
       length=Integer.parseInt(name);
       System.out.println("Enter Height");
       name=reader.nextLine();
       height=Integer.parseInt(name);
       System.out.println("Perimeter="+(length+length+height+height));
       System.out.println("Area="+(length*height));
       
    }
    
}
