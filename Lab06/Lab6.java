/*
 * Lab 6
 * Ethan Gutknecht
 * Instructor: Meisam Amjad
 * Section: G
 * Lab6.java
 * practicing methods
 */

import java.util.Scanner;

public class Lab6 {
  public static void main(String[] args) {
    // Declaring variables
    int userChoice, integerInput, value1, value2, value3, sum;
    String stringInput;
    Scanner input = new Scanner(System.in);
    
    //Display menu
    System.out.printf("Menu\n 1.hasX\n 2.big2Digits\n 3.loneSum\n 4.average\n");
    
    //Read user's choice
    System.out.printf("Enter your choice");
    userChoice = input.nextInt();
    
    //Invoke methods
    switch(userChoice) { 
      case 1: //has x
        //This is written for you as an example
        System.out.printf("\nDisplays true if there is any ‘x’ in the string. Returns false otherwise\n");
        System.out.printf("Enter a String: ");
        stringInput = input.next();
        System.out.println(hasX(stringInput));
        break;
        
      case 2: //3 digit int
        System.out.printf("\nDisplays true if the first digist is greater than the last digit.\n");
        System.out.printf("Enter a 3-digit integer: ");
        integerInput = input.nextInt();
        System.out.println(big2Digits(integerInput));
        break;
        
      case 3: //sum int
        System.out.printf("\nDisplays the sum of 3 values but if one value is identical to another it will be ignored in computing.\n");
        System.out.printf("Enter a 3 integer values: ");
        value1 = input.nextInt();
        value2 = input.nextInt();
        value3 = input.nextInt();
        System.out.println(loneSum(value1, value2, value3));
        break;
        
      case 4: //average
        System.out.printf("\nDisplays the average of 3 values.\n");
        System.out.printf("Enter a 3 integer values: ");
        value1 = input.nextInt();
        value2 = input.nextInt();
        value3 = input.nextInt();
        System.out.println(average(value1, value2, value3));
        break;
        
      default: //other
        System.out.println("Invalid Choice");
    }   
    System.out.println("**End**");
    
  }
  
  //check is a string has x method
  public static boolean hasX(String stringInput) {
    boolean containsX;
    if (stringInput.contains("x")) {
      containsX = true;
    }
    else {
      containsX = false;
    }
    return containsX;
  }
  
 //big2digist method
  public static boolean big2Digits(int number) {
    int value1 = ((number -(number % 100))/100);
    int value2 = ((number % 10));
    boolean containsX = value1 > value2;
    return containsX;
  }

  //lone sum method
  public static int loneSum(int num1, int num2, int num3) {
    int sum = 0;
    if ((num1 != num2) && (num2 != num3) && (num3 != num1)) {
      sum = num1 + num2 + num3;
    }
    else if ((num1 == num2) && (num2 == num3) && (num3 == num1)) {
      sum = 0;
    }
    else if (num1 == num2) {
       sum = num3;
    }
    else if (num2 == num3) {
      sum = num1;
    }
    else if (num3 == num1) {
      sum = num2;
    }
    return sum;
  }
  
//average method
  public static double average(int num1, int num2, int num3) {
    return ((num1 + num2 + num3) / 3.0);
  }
  
}
