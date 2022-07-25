/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 18, 2019
 * Description: 
 */

// These work correctly:  25, 52, 13, 19, 17, 68
// These do not work: 12, 36, 48, my program doesn't work with multiples of 12


import java.util.Scanner;

public class DonutBoxes{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("How many donuts: ");
     int numberOfDonuts = scan.nextInt(); //user input
     int numberOfBoxes = (numberOfDonuts - (numberOfDonuts % 12))/12 + 1;
     System.out.println("You will need " + numberOfBoxes + " boxes for the donuts.");
  }
}
  