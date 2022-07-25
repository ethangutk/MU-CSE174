/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday October 6, 2019
 * Description: a program that allows the user to find the area of a circle, surface area of a cylinder, or volume of a cylinder
 */


import java.util.Scanner;

public class Cylinder{
  //methods
  public static double circArea(double radius){ //area of circle
    return (Math.PI * Math.pow(radius, 2));
     }
  
  public static double cylArea(double radius, double height){ //area of cylinder
    //2*π*radius^2 + π*diameter*height
    return ((2 * Math.PI * Math.pow(radius, 2)) + Math.PI * (2*radius) * height);
     }
  
  public static double cylVolume(double radius, double height){ //volume of cylinder
    double areaOfCircle = circArea(radius);
    return (areaOfCircle * height);
     }
  
  
  //main method
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("-- Menu --");
     System.out.println("a) Area of a circle");
     System.out.println("b) Area of the surface of a cylinder");
     System.out.println("c) Volume of a cylinder");
       
     System.out.println("Enter your choice:");
     String userInput = scan.nextLine(); //user input choice
     
     //area of a circle
     if (userInput.length() == 1 && userInput.equalsIgnoreCase("a")) {
       System.out.println("Enter the radius:");
       double userInputRadius = scan.nextDouble(); //user input radius
       double circleArea = circArea(userInputRadius);
       System.out.printf("The area of the circle is %.3f", circleArea);
     }
     
     //surface area of a cylinder
     else if (userInput.length() == 1 && userInput.equalsIgnoreCase("b")) {
       System.out.println("Enter the radius:");
       double userInputRadius = scan.nextDouble(); //user input radius
       System.out.println("Enter the height:");
       double userInputHeight = scan.nextDouble(); //user input height
       double cylinderSurfaceArea = cylArea(userInputRadius, userInputHeight);
       System.out.printf("The area of the surface of the cylinder is %.3f", cylinderSurfaceArea);
     }
     
     //volume of a cylinder
     else if (userInput.length() == 1 && userInput.equalsIgnoreCase("c")) {
       System.out.println("Enter the radius:");
       double userInputRadius = scan.nextDouble(); //user input radius
       System.out.println("Enter the height:");
       double userInputHeight = scan.nextDouble(); //user input height
       double cylinderVolume = cylVolume(userInputRadius, userInputHeight);
       System.out.printf("The volume of the cylinder is %.3f", cylinderVolume);
     }
     
     else {
       System.out.println("The selection is not correct. Program terminated.");
     }
  }
  

}
  







