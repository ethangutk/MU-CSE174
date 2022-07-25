// Name: Ethan Gutknecht
// Instructor:
// Class: CSE174
// Date: September 12th, 2019
// Description: Writting a java program that uses math operator, Math and String methods
//


import java.util.Scanner;


public class Lab3 {
    public static void main(String[] args){
          //Variables
          Scanner scan = new Scanner(System.in);
          String firstName, lastName, phoneNumber;
          
          //user input
          System.out.printf("Enter your first and last name: ") ;
          firstName = scan.next();
          lastName = scan.next();
          System.out.printf("Enter your phone number in this format (___) ___ - ___: ") ;
          phoneNumber = scan.next();
          System.out.printf("Enter three scores: ");
          Double score1 = scan.nextDouble();
          Double score2 = scan.nextDouble();
          Double score3 = scan.nextDouble();
          
          //calculating values (med max and min)
          Double maxValue = Math.max(Math.max(score1, score2), score3);
          Double minValue = Math.min(Math.min(score1, score2), score3);
          Double medValue = ((score1 + score2 + score3) - (maxValue + minValue));
          
          //results
          System.out.printf("Name : %S %.1S %n", firstName, lastName );
          System.out.printf("Phone: %S%S%n", phoneNumber.substring(5,8), phoneNumber.substring(9,13)); 
          System.out.printf("Average = %.2f %n", (score1 + score2 + score3)/3 );
          System.out.printf("Maximum = %.2f %n", maxValue);
          System.out.printf("Median  = %.2f %n", medValue);
          System.out.printf("Minimum = %.2f %n", minValue);
    }
  }

