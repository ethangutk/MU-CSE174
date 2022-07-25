/*
 * Name: Ethan Gutknecht
 * Instructor : Meisam Amjad
 * Date: August 28th, 2019
 * File Name: Firstprogram.java
 * Description: a short program to help understand some of the basic functions of java
 */

import java.util.Scanner; //needed for user input


public class FirstProgram {
  
  public static void main(String[] args) {
    //declaring local variables
    String firstName, lastName;
    int targetNumber, userGuess, countGuesses;
    int randomTriangleHeight;
    Scanner keyboardReader = new Scanner(System.in);
    
    //get users name
    System.out.print("Enter first and last name: ");
    firstName = keyboardReader.next();
    lastName = keyboardReader.next();
      
    //Display a marquee with a personal greeting
    printBorder('*', 30);
    greet(firstName, lastName);
    printBorder('*', 30);
    
    //explain how to play
    explainGame(firstName);
    
    //set up game
    targetNumber = (int) (1 + 100 * Math.random());
    
    for (countGuesses = 1; countGuesses <= 10; countGuesses++) {
     printBorder('*', 30);
     System.out.print("Enter guess #" + countGuesses + ": ");
     userGuess = keyboardReader.nextInt();
     
     //The user made the right guess.
     if (userGuess == targetNumber) {
       System.out.print("Good job "+ firstName + ", ");
       System.out.println("you got it in "+ countGuesses + " tries.");
       break;
     }
     else if (userGuess < targetNumber) {
      System.out.println("Too low! Guess higher.");
     }
     else if (userGuess > targetNumber) {
      System.out.println("Too high! Guess lower.") ;
     }
    }
    
    if (countGuesses > 10){
     System.out.println("Hard luck! " + firstName + " " ); 
    }
    printBorder('#', 30);
    
    //start of triangle code
    randomTriangleHeight = (int) (1 + 30 * Math.random()); //code for random triangle height
    System.out.println("And now, a " + randomTriangleHeight + " row triangle!");
    char asciiID = (char) 61; //61 is the asciiID for the = sign
    for (int row = 1; row <= randomTriangleHeight; row++) { //creates triangle
      printBorder(asciiID, row);
    }   //end of creating triangle
    //end of triangle code

  } //main
  
  
  
  public static void greet(String fName, String lName) { //greating the player
    System.out.println("Hello "+ fName + " "+ lName + ", ");
    System.out.println("Welcome to my first CSE 174 program!");
    System.out.println("Enjoy the show!");
    System.out.println(" Sincerely,\n Ethan Gutknecht");
  } //greet
  
  
  
  public static void explainGame(String name) { //explaining game
    System.out.println("Lets play a game, " + name + "..." );
    System.out.println("I'm thinking of a number from 1 to 100.");
    System.out.println("Let's see if you can guess it in fewer than 10 tries.");
  } //explainGame
  
  
  
  public static void printBorder(char symbol, int size) {
    for (int i = 0; i < size; i++) {
     System.out.print(symbol); 
    }
    System.out.println();//creates gap
  } //printBoarder
  
  
  
} //class (FirstProgram)