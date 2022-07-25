/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 18, 2019
 * Description: code that makes the user input a word and two numbers.  then the code will switch two characters based on the numbers.
 */

import java.util.Scanner;

public class SwapLetters{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a word: ");
     String word = scan.nextLine(); //user input for word
     System.out.println("Enter two values for i and j between (0-"+ (word.length() - 1) +"):");
     int value1 = scan.nextInt(); //user input for i
     int value2 = scan.nextInt(); //user input for j
     //                        (first section of word)   + (first character swap)              + (middle section of word)       
     System.out.println("** " + word.substring(0,value1) + word.substring(value2, (value2 +1)) + word.substring((value1 + 1), (value2))
     
     //                        + (second character swap)             + (last section of word) )         
                               + word.substring(value1, (value1 +1)) + word.substring(value2 +1) + " **");           

  }
}
  
  

  