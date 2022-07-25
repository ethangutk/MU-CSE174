/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday October 6, 2019
 * Description: a program that prints boxes based on the user input
 */


import java.util.Scanner;

public class Boxes{
    
  public static void createSquare(char c){
       System.out.println("");
       System.out.println(c+" "+c+" "+c+" "+c+" "+c);
       System.out.println(c + "       " + c);
       System.out.println(c + "       " + c);
       System.out.println(c + "       " + c);
       System.out.println(c+" "+c+" "+c+" "+c+" "+c);
       System.out.println("");
     }
  
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     //variables

     System.out.println("Enter the characters to be displayed in the boxes:");
     String userInput = scan.nextLine(); //user input
     if (userInput.length() == 3) {
       char char1 = userInput.charAt(0);
       char char2 = userInput.charAt(1);
       char char3 = userInput.charAt(2);

       createSquare(char1);//call method1
       createSquare(char2);//call method2
       createSquare(char3);//call method3
     }
     else {
       System.out.println("Invalid Input!");
     }

  }
  

}
  







