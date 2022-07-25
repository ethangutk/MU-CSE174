/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 19, 2019
 * Description: Code that has the user input a temperature in fahrenheit then itll convert it the celsius and state if its a solid, liquid, or gas.     
 */

import java.util.Scanner;

public class Lab4{
  public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the water temperature in degrees fahrenheit: ");
       double waterTemperatureF = scan.nextDouble(); //user input
       double waterTemperatureC = (waterTemperatureF - 32.0) * (5.0/9); //converts fahrenheit to celsius
       System.out.printf("%.3f Fahrenheit = %.3f Celsius %n", waterTemperatureF, waterTemperatureC); //prints results
       
       if (waterTemperatureC <= 0) { //checks if its a solid
         System.out.println("The water is solid");
       }
       else if (waterTemperatureC >= 100) { //checks if its a gas
         System.out.println("The water is gas");
       }
       else { //if its not a solid or gas it must be a liquid
         System.out.println("The water is liquid");
       }
  }
}
  