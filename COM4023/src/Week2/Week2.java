/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author amstephenson
 */
public class Week2 {
    
    public static void main(String[] args) {
       
       //Exercise 1
       int age;
       Scanner reader = new Scanner(System.in);
       
       System.out.println("Input your age:");
       String name=reader.nextLine();
       age=Integer.parseInt(name);
       int currentYear = java.time.LocalDate.now().getYear();
       int birthYear = currentYear - age;
       System.out.println("You were born in " + birthYear);
       if (age>18)
           System.out.println("You are over 18");
       
       //Exercise 2
       System.out.println("Enter your Grade (A,B,C,D,E,or F):");
       char classification = reader.next().charAt(0);
             
       switch(classification){
           case 'A': System.out.println("This is a 1st");break;
           case 'B': System.out.println("This is a 2:1");break;
           case 'C': System.out.println("This is a 2:2");break;
           case 'D': System.out.println("This is a 3rd");break;
           case 'E': System.out.println("This is an Ordinary");break;
           case 'F': System.out.println("This is a fail");break;
           default: System.out.println("This is an invalid grade");
       }    
      
       //Exercise 3
       for (int loop=0;loop<=9;loop++){
           System.out.print(" "+ loop);
       }
       System.out.println();
      
      //Exercise 4
      for (int loop=1;loop<=12;loop++){
          System.out.println(loop+"*7="+loop*7);
      }
    
      //Exercise 5
      int table;
      Scanner reader1 = new Scanner(System.in);
      System.out.println("Which Times-table (2-12):");
      name=reader1.nextLine();
      table=Integer.parseInt(name);
         
      for (int loop=1;loop<=12;loop++){
          System.out.println(loop+"*"+table+"="+(loop*table));
      }
    }   
    
}
