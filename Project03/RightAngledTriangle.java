/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 15, 2019
 * Description: Lines of code that gives us info and calculations for a right triangle that the user will input
 * 
 */


import java.util.Scanner;
  public class RightAngledTriangle {
    public static void main(String[] args){
          //Variables
          Scanner scan = new Scanner(System.in);
          Double side1, side2, side3;
      
          //User input
          System.out.printf("Enter three letter name of the triangle: ");
          String triangleName = scan.nextLine();
          System.out.printf("Enter the coordinates of %s %n: ", triangleName.substring(0, 1).toUpperCase()) ;
          Double coordA1 = scan.nextDouble();
          Double coordA2 = scan.nextDouble();
          System.out.printf("Enter the coordinates of %s %n: ", triangleName.substring(1, 2).toUpperCase()) ;
          Double coordB1 = scan.nextDouble();
          Double coordB2 = scan.nextDouble();
          
          //coords
          System.out.printf("##### Right Triangle Calculations for the %s Triangle ##### %n", triangleName);
          System.out.printf("*** The coordinates for the triangle are: *** %n");
          System.out.printf("%S: (%.3f, %.3f) %n", triangleName.substring(0, 1).toUpperCase(), coordA1, coordA2);
          System.out.printf("%S: (%.3f, %.3f) %n", triangleName.substring(1, 2).toUpperCase(), coordB1, coordB2);
          System.out.printf("%S: (%.3f, %.3f) %n", triangleName.substring(2, 3).toUpperCase(), coordB1, coordA2);
          
          //sides        
          side1 = Math.abs((coordA1 - coordB1));
          side2 = Math.abs((coordA2 - coordB2));
          side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
          
          System.out.printf("**** The sides are ****%n");
          System.out.printf("Side %s: %.3f %n", triangleName.substring(0, 1).toLowerCase(), side1);
          System.out.printf("Side %s: %.3f %n", triangleName.substring(1, 2).toLowerCase(), side2);
          System.out.printf("Side %s: %.3f %n", triangleName.substring(2, 3).toLowerCase(), side3);
          
          //angles        
          System.out.printf("**** The angles are ****%n");
          System.out.printf("Angle %S: %.3f %n", triangleName.substring(0, 1).toUpperCase(), Math.toDegrees(Math.acos(side1/side3)));
          System.out.printf("Angle %S: %.3f %n", triangleName.substring(1, 2).toUpperCase(), Math.toDegrees(Math.acos(side1/side2)));
          System.out.printf("Angle %S: 90.000 %n", triangleName.substring(0, 1).toUpperCase());
          
          //perimeter
          System.out.printf("**** The area and perimeter ****%n");
          System.out.printf("Area = %.3f sq units %n", (0.5 * side1 * side2));
          System.out.printf("Perimeter = %.3f units %n", (side1 + side2 + side3));
          
          //centriod
          System.out.printf("**** The centroid coordinate ****%n");
          System.out.printf("0 : (%.3f, %.3f)%n", ((coordA1 + coordB1 + coordB1)/3), ((coordA2 + coordA2 + coordB2)/3));
    }
  }