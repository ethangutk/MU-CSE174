/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday November 3, 2019
 * Description: it creates a menu and allows the user to choose 1 of 3 methods, run, alternating variables, and reverse
 */


//true = opened
//false = closed



import java.util.Scanner;
import java.util.Arrays;

public class Program11{
  //GLOBAL VARIABLES
  static Scanner scan = new Scanner(System.in);
  
  
  
  //print results
  public static String printResults(boolean[] inputArray){
    String outputString = "";
    int numberOpened = 0, numberClosed = 0;
    
    for (int z=0; z < inputArray.length; z++){
      if (inputArray[z] == false){
        outputString = outputString + "-";
        numberClosed++;
      }
      else if (inputArray[z] == true ){
        outputString = outputString + "O";
        numberOpened++;
      }
    }
    return (outputString + "      Opened: " + numberOpened + "   Closed:" + numberClosed);
  }
  
  
  //open close lockers
  public static boolean[] openCloseLockers(int studentNumber, int numOfLockers){
    boolean[] returnArray = new boolean[numOfLockers];
    for (int o = 0; o < numOfLockers; o++) returnArray[o] = false;
    
    for (int v = 1; v < studentNumber; v++){
      for (int w = 0; w < returnArray.length; w++){
        if (returnArray[w] == true  && (w+1) % v == 0) returnArray[w] = false; //changes to false
        else if (returnArray[w] == false  && (w+1) % v == 0) returnArray[w] = true; //changes to true
      }
    }
    
    return returnArray;
  }
  
  
  //whats opened
  public static void printWhatsOpened(boolean[] inputArray){
    String outputString = "Open: ";
    for (int o = 0; o < inputArray.length; o++){
      if (inputArray[o] == true) outputString += (o + 1) + " ";
    }
    System.out.println(outputString);
  }
  
  
  
  
//MAIN METHOD
  public static void main(String[] args){
    int numberOfLockers;
    String continueChoice = "y";
    
    while (continueChoice.equalsIgnoreCase("y")) {
      
      System.out.print("Number of lockers:");
      numberOfLockers = scan.nextInt(); //number of lockers user input
      if (numberOfLockers <= 2){
        System.out.println("You must have two or more lockers!");
        continue;
      }
      
      System.out.println("Show stages [y/n]?");
      String showStages = scan.next(); //show stages user input
      
      for (int b = 2; b <= numberOfLockers + 1 ; b++){ //ten students
        boolean[] changingArray = openCloseLockers(b, numberOfLockers); //calls a method that will return an array based on the student number
        if (showStages.equalsIgnoreCase("y")) System.out.println(printResults(changingArray));
        if (b == numberOfLockers + 1) printWhatsOpened(changingArray);
      }
      
      System.out.println("Do you want to continue [y/n]?");
      continueChoice = scan.next(); //show stages user input
    }
    System.out.println("End");
  }
  
}
