/*
 * Name: Ethan Gutknecht
 * Instructor : Meisam Amjad
 * Date: September 5th, 2019
 * File Name: Lab2.java
 * Description: finding the surface area and volume of a shpere
 */

import java.util.Scanner; //needed for user input


public class Lab2{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);//input scanner
  double userInputRadius; //declaring variable
  
// radius calculations
  System.out.print("Enter the sphere's radius: ");
  userInputRadius = input.nextDouble();
  System.out.println("surfance area = " + (4 * Math.PI * Math.pow(userInputRadius, 2) ) ); //surface area
  System.out.println("volume = " + ( (4.0/3.0) * Math.PI * Math.pow(userInputRadius, 3) ) );//volume
  
//new radius calculations
  System.out.print("Enter a new radius: ");
  userInputRadius = input.nextDouble();
  System.out.println("surfance area = " + (4 * Math.PI * Math.pow(userInputRadius, 2) ) ); //surface area
  System.out.println("volume = " + ( (4.0/3.0) * Math.PI * Math.pow(userInputRadius, 3) ) );//volume
  }
}