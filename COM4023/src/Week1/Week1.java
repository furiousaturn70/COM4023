package Week1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

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
       
       //Exercise 4
       double num1, num2;
       System.out.println("Enter number 1:");
       name=reader.nextLine();
       num1=Double.parseDouble(name);
       System.out.println("Enter number 2:");
       name=reader.nextLine();
       num2=Double.parseDouble(name);
       System.out.println("Average of numbers is: "+((num1+num2)/2));
       
       //Exercise 5
       int number1, number2;
       System.out.println("Enter number 1:");
       name=reader.nextLine();
       number1=Integer.parseInt(name);
       System.out.println("Enter number 2:");
       name=reader.nextLine();
       number2=Integer.parseInt(name);
       System.out.println("Original Order: "+number1+","+number2);
       System.out.println("Reverse Order: "+number2+","+number1);
       
       //Exercise 6
       int age;
       System.out.println("Input your age:");
       name=reader.nextLine();
       age=Integer.parseInt(name);
       int currentYear = java.time.LocalDate.now().getYear();
       int birthYear = currentYear - age;
       System.out.println("You were born in " + birthYear);

       
       //Exercise 7
       System.out.println("Enter your birth year: ");
       name=reader.nextLine();
       birthYear=Integer.parseInt(name);

       System.out.println("Enter your birth month (1-12): ");
       name=reader.nextLine();
       int birthMonth=Integer.parseInt(name);

       System.out.println("Enter your birth day (1-31): ");
       name=reader.nextLine();
       int birthDay=Integer.parseInt(name);

       LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
       LocalDate currentDate = LocalDate.now();
       Period period = Period.between(birthDate, currentDate);

       int daysOld = period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
       System.out.println("You are " + daysOld + " days old.");

       //Exercise 8
       System.out.println("Enter number of feet: ");
       name=reader.nextLine();
       double feet=Double.parseDouble(name);
       double miles = feet/5280;
       System.out.printf("%.2f feet is equal to %.2f miles",feet,miles);
       System.out.println();
       
       //Exercise 9
       System.out.print("Enter the deposit amount: ");
       name=reader.nextLine();
       double depositAmount = Double.parseDouble(name);
       
       double interestRate = 0.01; // 1% interest rate
       double interest = depositAmount * interestRate;

       // Calculate the total amount after interest
       double totalAmount = depositAmount + interest;

       // Display the result
       System.out.println("Total amount after interest: " + totalAmount);
              
       //used reader for various exercises, now closing it
       reader.close();
    }
    
}
