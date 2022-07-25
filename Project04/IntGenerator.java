/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 18, 2019
 * Description: code that generates a random number between 50 and 100 and checks if its even or odd
 */


public class IntGenerator{
  public static void main(String[] args){
    int randomNumber = (50 + (int) (Math.random() * (100 - 50 + 1)));
    
    if (randomNumber % 2 == 0) { //check if it's even
      System.out.println("The generated number is " + randomNumber + " and it is EVEN!");
    }
    else if (randomNumber % 2 == 1) { //check if its odd
      System.out.println("The generated number is " + randomNumber + " and it is ODD!");
    }
    
    
  }
}
