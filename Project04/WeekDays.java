/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 18, 2019
 * Description: the user will input a number and the output will be the corrisponding day with the number
 */

import java.util.Scanner;

public class WeekDays{
  public static void main(String[] args){
     
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number (0-6:");
     int num =  scan.nextInt();
     
     if (num == 0) { //sunday
         System.out.println("0 is Sunday");
     }
     else if (num == 1) { //monday
         System.out.println("1 is Monday");
     }
     else if (num == 2) { //tuseday
         System.out.println("2 is Tuseday");
     }
     else if (num == 3) { //wednesday
         System.out.println("3 is Wednesday");
     }
     else if (num == 4) { //thursday
         System.out.println("4 is Thursday");
     }
     else if (num == 5) { //friday
         System.out.println("5 is Friday");
     }
     else if (num == 6) { //saturday
         System.out.println("6 is Saturday");
     }   
  }
}
  
  

  