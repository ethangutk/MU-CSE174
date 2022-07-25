/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday October 20, 2019
 * Description: a program that allows the user to find the area of a circle, surface area of a cylinder, or volume of a cylinder
 */


import java.util.Scanner;
public class Lab8{
  //global variables
  static Scanner scan = new Scanner(System.in);
  static double totalWordsLength = 0;
  static int amountOfWordsInputed = 0;
  static int shortestWordLength = Integer.MAX_VALUE;
  static int longestWordLength = Integer.MIN_VALUE;
  static int numberOfWordsContainingQ = 0;
  static int numberOfWordsStartingWithVowel = 0;
  static String allWordsTogether = "";
  
  public static void averageWordLength(String wordInput){
    totalWordsLength += wordInput.length();
    amountOfWordsInputed++;
  }
  
  
  public static void shortestWordLength(String wordInput){
    if (wordInput.length() < shortestWordLength) shortestWordLength = wordInput.length();
  }
  
  
  public static void longestWordLength(String wordInput){
    if (wordInput.length() > longestWordLength) longestWordLength = wordInput.length();
  }
  
  
  public static void wordsContainingQ(String wordInput){
    int loopCount = 0;
    while (loopCount < wordInput.length()){
      if (wordInput.charAt(loopCount) == 'q' || wordInput.charAt(loopCount) == 'Q'){
        numberOfWordsContainingQ++;
        break;
      }
      loopCount++;
    }
  }
  
  
  public static boolean wordsStartingWithVowel(String wordInput){
    boolean returnValue = false;
    if (wordInput.substring(0,1).equalsIgnoreCase("a")) returnValue = true;
    if (wordInput.substring(0,1).equalsIgnoreCase("e")) returnValue = true;
    if (wordInput.substring(0,1).equalsIgnoreCase("i")) returnValue = true;
    if (wordInput.substring(0,1).equalsIgnoreCase("o")) returnValue = true;
    if (wordInput.substring(0,1).equalsIgnoreCase("u")) returnValue = true;
    return returnValue;
  }
  
  
  public static void wordsEntered(String wordInput){
    allWordsTogether += wordInput + " ";
  }
  
  
  //main method
  public static void main(String[] args){
    //variables
    int howManyWords, loopCount = 1;
    
    //start of code
    System.out.println("How many words will you enter? ");
    howManyWords = scan.nextInt(); //user input
    if (howManyWords > 0) {
      while (loopCount <= howManyWords) {
        System.out.println("Enter word #" + loopCount + ":");
        String wordInput = scan.next(); //user input
        averageWordLength(wordInput);  //calling average word length method
        shortestWordLength(wordInput);  //calling shortest word length method
        longestWordLength(wordInput);  //calling longest word length method
        wordsContainingQ(wordInput);  //calling words containing q method
        if (wordsStartingWithVowel(wordInput) == true) numberOfWordsStartingWithVowel++;  //calling words starting with vowel
        wordsEntered(wordInput);  //calling "you entered these words" method
        loopCount++;
      }
      System.out.println("RESULTS:...");
      System.out.println("Average word length: " + (totalWordsLength / amountOfWordsInputed));
      System.out.println("Length of the shortest word: " + shortestWordLength);
      System.out.println("Length of the longest word: " + longestWordLength);
      System.out.println("Words containing q: " + numberOfWordsContainingQ);
      System.out.println("Words starting with a vowel: " + numberOfWordsStartingWithVowel);
      System.out.println("You entered " + amountOfWordsInputed + " words: " +  allWordsTogether);
    }
    else System.out.println("NO WORDS ENTERED");
  }
}








