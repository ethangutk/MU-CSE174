/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday October 17, 2019
 * Description: a program that asks the user to choose from a menu of counting digits and largest and smallest pairs
 */


import java.util.Scanner;
public class PatternChecker{
  //global variables
  static Scanner scan = new Scanner(System.in);
  static int firstmax = Integer.MIN_VALUE;
  static int secondmax = 0;
  static int firstmin = Integer.MAX_VALUE; //2147483647
  static int secondmin = 0;
  static int amount0 = 0;
  static int amount1 = 0;
  static int amount2 = 0;
  static int amount3 = 0;
  static int amount4 = 0;
  static int amount5 = 0;
  static int amount6 = 0;
  static int amount7 = 0;
  static int amount8 = 0;
  static int amount9 = 0;
  static String countingDigitsResults = "";
  
  
  
  //max number method
  public static void maxNumber(int num){
    if (num > firstmax){
      secondmax = firstmax;
      firstmax  = num;
    }
    else if (num < firstmax && num > secondmax) secondmax = num;
  }
  
  
  
  //min number method
  public static void minNumber(int num){
    if (num < firstmin){
      secondmin = firstmin;
      firstmin  = num;
    }
    else if (num > firstmin && num < secondmin) secondmin = num;
  }
  
  
  
  //creates pair codes method
  public static void countPairs(int num){
    int loopCount = 0;
    String numString = "" + num; //turns number to string
    while (loopCount < numString.length()) {
      if (numString.charAt(loopCount) == '0') amount0++;
      if (numString.charAt(loopCount) == '1') amount1++;
      if (numString.charAt(loopCount) == '2') amount2++;
      if (numString.charAt(loopCount) == '3') amount3++;
      if (numString.charAt(loopCount) == '4') amount4++;
      if (numString.charAt(loopCount) == '5') amount5++;
      if (numString.charAt(loopCount) == '6') amount6++;
      if (numString.charAt(loopCount) == '7') amount7++;
      if (numString.charAt(loopCount) == '8') amount8++;
      if (numString.charAt(loopCount) == '9') amount9++;
      loopCount++;
    }
  }
  
  
  
  //creates print return of the pairing digits
  public static void createCountingDigitsReturn(){
    if (amount0 > 0) countingDigitsResults += " (0, " + amount0 +"),";
    if (amount1 > 0) countingDigitsResults += " (1, " + amount1 +"),";
    if (amount2 > 0) countingDigitsResults += " (2, " + amount2 +"),";
    if (amount3 > 0) countingDigitsResults += " (3, " + amount3 +"),";
    if (amount4 > 0) countingDigitsResults += " (4, " + amount4 +"),";
    if (amount5 > 0) countingDigitsResults += " (5, " + amount5 +"),";
    if (amount6 > 0) countingDigitsResults += " (6, " + amount6 +"),";
    if (amount7 > 0) countingDigitsResults += " (7, " + amount7 +"),";
    if (amount8 > 0) countingDigitsResults += " (8, " + amount8 +"),";
    if (amount9 > 0) countingDigitsResults += " (9, " + amount9 +"),";
    countingDigitsResults = countingDigitsResults.substring(0, countingDigitsResults.length() - 1);
  }
  
  
  
  //main method
  public static void main(String[] args){
    // local variables 
    int i = 0, choice, limit, numbers = 0;
    
    
    //start of program
    while (true) {
      System.out.println("List of Pattern Checker problems:");
      System.out.println("1) Largest and Smallest Pairs");
      System.out.println("2) Counting digits");
      System.out.println("3) Quit");
      
      choice = scan.nextInt();
      System.out.println("Choice: " + choice);
      
      
      //choice 1
      if (choice == 1) {
        System.out.println("Enter limit: ");
        limit = scan.nextInt();
        System.out.println("Enter " + limit + " numbers:");
        
        while (i < limit) {
          int userInput = scan.nextInt();
          maxNumber(userInput); //finds max
          minNumber(userInput); //finds min
          i++;
        }
        System.out.println("*** Largest and Smallest Pairs: (" + firstmax + ", " + secondmax + "),(" + firstmin + ", " + secondmin + ")");
        System.out.println("");
      }
      
      
      //choice 2
      else if (choice == 2) {
        int randomNumber = 1000000 + (int)(Math.random()*(2000000 - 1000000 + 1));
        System.out.println("The generated random number is: " + randomNumber);
        countPairs(randomNumber); //counts pairs 
        createCountingDigitsReturn(); //creates print of pairs
        System.out.println("*** Counted Pairs are =" + countingDigitsResults);
        System.out.println("");
      }
      
      
      //choice 3
      else if (choice == 3) {
        System.out.print("*** End ");
        break;
      }
      
      
      //invalad input
      else {
        System.out.println("Invalid Input");
        System.out.println("");
      }
      
      
      //resetting variables
      firstmax = Integer.MIN_VALUE; //-2147483647
      secondmax = 0;
      firstmin = Integer.MAX_VALUE; //2147483647
      secondmin = 0;
      amount0 = 0;
      amount1 = 0;
      amount2 = 0;
      amount3 = 0;
      amount4 = 0;
      amount5 = 0;
      amount6 = 0;
      amount7 = 0;
      amount8 = 0;
      amount9 = 0;
      countingDigitsResults = "";
      //end of resetting variables
    }
  }
}








