/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday October 6, 2019
 * Description: a program that finds the temperature at the depth of the earth then converts it from C to F
 */


import java.util.Scanner;

public class EarthTemp{
  //methods
  public static double getCelsiusAtDepth(double depth){
    return (10 * depth + 20);
     }
  
  public static double convertCelsiusToFahrenheit(double temperature){
    return (1.8 * temperature + 32);
     }
  
  //main method
  public static void main(String[] args){
     double celciusTemp, fahrenheitTemp;
     Scanner scan = new Scanner(System.in);
     //variables

     System.out.println("Enter the depth in kilometers:");
     double depth = scan.nextDouble(); //user input
     celciusTemp = getCelsiusAtDepth(depth);
     fahrenheitTemp = convertCelsiusToFahrenheit(celciusTemp);
     System.out.printf("The Celcius temperature at the depth %.2f km is %.2f %n", depth, celciusTemp);
     System.out.printf("The Fahrenheit temperature at the depth %.2f km is %.2f %n", depth, fahrenheitTemp);
  }
  

}
  







