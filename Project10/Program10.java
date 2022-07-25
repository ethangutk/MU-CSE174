/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday November 3, 2019
 * Description: it creates a menu and allows the user to choose 1 of 3 methods, run, alternating variables, and reverse
 */


import java.util.Scanner;
import java.util.Arrays;

public class Program10{
  //GLOBAL VARIABLES
  static Scanner scan = new Scanner(System.in);
  static int inputMenuChoice;
  static int numberOfIntValues;
  
  //GET VALUES METHOD
  private static int[] getValues(){
    while (true){
      System.out.print("How many integer values: ");
      numberOfIntValues = scan.nextInt();
      if (numberOfIntValues > 0) break;
      else System.out.println("Invalid Input!");
    }
    int[] array = new int[numberOfIntValues];
    System.out.println("Enter the numbers:");
    for (int i = 0; i < numberOfIntValues; i++){
      array[i] = scan.nextInt();
    }
    return array;
  }
  
  
  //ALERNATING SUM METHOD
  public static int alternatingSum(){
    int[] array = getValues();
    int alternatingSumOfArray = 0;
    for (int i = 0; i < array.length; i++){
      if (i % 2 == 0){
        alternatingSumOfArray += array[i];
      }
      else if (i % 2 == 1){
        alternatingSumOfArray -= array[i];
      }
    }
    return alternatingSumOfArray;
  }
  
  
  //REVERSE METHOD
  public static int[] reverse(){
    int[] array = getValues();
    int[] reverseArray = new int[array.length];
    for (int i = 0; i < array.length; i++){
      reverseArray[i] = array[array.length - (i+1)];
    }
    return reverseArray;
  }
  
  
  //RUN METHOD
  public static void run(){ 
    int[] array = new int[20];
    int squenceTestingLength = 0;
    int squenceTestingStart = 0;
    int sequenceLongestStart = 0;
    int squenceLongestLength = 0;
    String output = "";
    
    for (int i = 0; i < 20; i++) array[i] = (int)(Math.random()*6) + 1;
    
    for (int i = 1; i < 20; i++){
      if (array[i-1] == array[i]) {
        squenceTestingLength++;
        squenceTestingStart = i - squenceTestingLength;
      }
      else if ((array[i-1] != array[i] && squenceTestingLength > 0)){
        if (squenceLongestLength < squenceTestingLength){
          squenceLongestLength = squenceTestingLength;
          sequenceLongestStart = squenceTestingStart;
        }
        squenceTestingLength = 0;
        squenceTestingStart = 0;
      }
    }
    
    for (int i = 0; i < 20; i++){
      if (i == sequenceLongestStart && squenceLongestLength != 0) output += "("+ array[i] + " ";
      else if (i == sequenceLongestStart + squenceLongestLength && squenceLongestLength != 0) output += array[i] + ") ";  
      else output += array[i] + " ";
    }
    System.out.println(output);
  }
  
  
  //MAIN METHOD
  public static void main(String[] args){
    while (true){
      System.out.println("");
      System.out.println("PROGRAM #10");
      System.out.println("1- alternatingSum");
      System.out.println("2- reverse");
      System.out.println("3- Run");
      System.out.println("4- Exit");
      do {
        System.out.println("Enter a number [1-4]");
        inputMenuChoice = scan.nextInt();
        
        if (inputMenuChoice == 1) { //alternatingSum
          System.out.println("** alternatingSum **");
          System.out.println("The result is:" + alternatingSum());
        }
        
        
        else if (inputMenuChoice == 2) { //reverse
            int[] reverseArray = reverse();
            String output = "";
            for (int z = 0; z < reverseArray.length; z++){
            output += reverseArray[z] + " ";
          }
          
          System.out.println("The reverse array is:" + output);
        }
        
        
        else if (inputMenuChoice == 3) { //run
          run();
        }
        
        
        else if (inputMenuChoice < 1 || inputMenuChoice > 4){ //invalid input
          System.out.println("Invalad Input!");
        }
        
        
      } while (inputMenuChoice < 1 || inputMenuChoice > 4);
      if (inputMenuChoice == 4) break; //exit code
    }
  }
}
