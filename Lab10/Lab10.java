/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday October 31, 2019
 * Description: It creates and organizes a certain amount of random numbers based on the users input
 */

import java.util.Scanner;
import java.util.Arrays;

public class Lab10{
  static Scanner scan = new Scanner(System.in);
  
  public static void main(String[] args){
    System.out.println("How many random numbers do you want to generate?");
    int numberOfRandomNumbers = scan.nextInt();
    System.out.println("What is the number of values for each random draw?");
    int numberDraws = scan.nextInt();
    
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
      
    
    //this creates the array with all of the random numbers
    int[] randomNumberArray = new int[numberOfRandomNumbers];
    for (int z = 0; z < numberOfRandomNumbers; z++) randomNumberArray[z] = (int)(Math.random() * numberDraws);
    
    //this counts and "organizes" all of the random numbers
    int[] howManyNumbersArray = new int[numberDraws];
    for (int z = 0; z < numberOfRandomNumbers; z++) howManyNumbersArray[randomNumberArray[z]] = howManyNumbersArray[randomNumberArray[z]] + 1;
    
    //this prints the results
    for (int z = 0; z < numberDraws; z++){
      if (maxValue < howManyNumbersArray[z]) maxValue = howManyNumbersArray[z];
      if (minValue > howManyNumbersArray[z]) minValue = howManyNumbersArray[z];
      System.out.println(z+ " " + howManyNumbersArray[z]);
    }
    System.out.println("The max difference = " + (maxValue - minValue));
    
    
    
  }
  
}