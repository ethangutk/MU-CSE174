/* Name: Ethan Gutknecht
 * Class: CSE174
 * Instructor: Meisam Amjad
 * Date: Sunday September 29, 2019
 * Description: Creates a Math quiz based on the user input of "easy" or "hard"
 */


import java.util.Scanner;

public class MathQuiz{
  public static void main(String[] args){
     long timeStart = System.nanoTime();
     Scanner scan = new Scanner(System.in);
     //variables
     int multiplactionScoreCorrect = 0, divisionScoreCorrect = 0, testTime, randomValue1, randomValue2, userAnswer, randomMultiplactionNumber1 = 10, randomMultiplactionNumber2 = 10 ;      
     double multiplactionScorePercent, divisionScorePercent, totalScorePercent;
     
     //introduction and instructions
     System.out.println("Welcome to my math quiz!");
     System.out.println("This quiz will give you four multiplication problems,");
     System.out.println("followed by four division problems.");
     System.out.println("An easy quiz will include numbers up to 100.");
     System.out.println("A hard quiz will include numbers up to 1000.");
     
     System.out.println("-----------------------------------------------------");
     
     //user input of easy or hard
     System.out.println("Do you want an easy quiz or a hard quiz?");
     System.out.println("Enter the word hard or easy:");
     String inputDifficulty = scan.nextLine(); //user input
     
     
     
     System.out.println("-MULTIPLICATION--------------------------------------");
     System.out.printf("You have chosen %s. %n", inputDifficulty);
     //Changes difficulty to hard
     if (inputDifficulty.equalsIgnoreCase("hard")) { randomMultiplactionNumber1 = 25; randomMultiplactionNumber2 = 40;}
     
     //multiplication question 1 
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d × %d = ", randomValue1, randomValue2);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue1 * randomValue2)) {
       multiplactionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n", multiplactionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d × %d = %d. %d answers correct so far.%n", randomValue1, randomValue2, (randomValue1 * randomValue2), multiplactionScoreCorrect);     
     }
     
     //multiplication question 2
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d × %d = ", randomValue1, randomValue2);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue1 * randomValue2)) {
       multiplactionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n", multiplactionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d × %d = %d. %d answers correct so far.%n", randomValue1, randomValue2, (randomValue1 * randomValue2), multiplactionScoreCorrect);     
     }

            
     //multiplication question 3
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d × %d = ", randomValue1, randomValue2);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue1 * randomValue2)) {
       multiplactionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n", multiplactionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d × %d = %d. %d answers correct so far.%n", randomValue1, randomValue2, (randomValue1 * randomValue2), multiplactionScoreCorrect);     
     }
       
            
     //multiplication question 4
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d × %d = ", randomValue1, randomValue2);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue1 * randomValue2)) {
       multiplactionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n %n", multiplactionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d × %d = %d. %d answers correct so far. %n %n", randomValue1, randomValue2, (randomValue1 * randomValue2), multiplactionScoreCorrect);     
     }
     
     multiplactionScorePercent = (multiplactionScoreCorrect/4.00 *100);
     
     System.out.println("-DIVISION--------------------------------------------");
     
     //division question 1
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d ÷ %d = ", (randomValue1 * randomValue2), randomValue1);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue2)) {
       divisionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n %n", divisionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d ÷ %d = %d. %d answers correct so far. %n %n", (randomValue1 * randomValue2), randomValue1, randomValue2, divisionScoreCorrect);     
     }
     
       
     //division question 2
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d ÷ %d = ", (randomValue1 * randomValue2), randomValue1);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue2)) {
       divisionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n %n", divisionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d ÷ %d = %d. %d answers correct so far. %n %n", (randomValue1 * randomValue2), randomValue1, randomValue2, divisionScoreCorrect);     
     }
     
          
     //division question 3
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d ÷ %d = ", (randomValue1 * randomValue2), randomValue1);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue2)) {
       divisionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n %n", divisionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d ÷ %d = %d. %d answers correct so far. %n %n", (randomValue1 * randomValue2), randomValue1, randomValue2, divisionScoreCorrect);     
     }
     
          
     //division question 4
     randomValue1 = (1 + (int) (Math.random() * (randomMultiplactionNumber1 - 1 + 1)));
     randomValue2 = (1 + (int) (Math.random() * (randomMultiplactionNumber2 - 1 + 1)));
     System.out.printf("%d ÷ %d = ", (randomValue1 * randomValue2), randomValue1);
     userAnswer = scan.nextInt();
     if (userAnswer == (randomValue2)) {
       divisionScoreCorrect += 1;
       System.out.printf("Correct! %d answers correct so far. %n %n", divisionScoreCorrect);
     }
     else {
       System.out.printf("Sorry, %d ÷ %d = %d. %d answers correct so far. %n %n", (randomValue1 * randomValue2), randomValue1, randomValue2, divisionScoreCorrect);     
     }
     
     
     divisionScorePercent = (divisionScoreCorrect/4.0 *100);
     
     System.out.println("-RESULTS---------------------------------------------");
     long timeEnd = System.nanoTime();
     double timeTaken = (timeEnd - timeStart) / 1000000000;
     System.out.printf("You answered the questions in  %.2f seconds.%n", timeTaken);
     
     System.out.printf("Multiplication score: %d out of 4 (%.2f%%)%n", multiplactionScoreCorrect, multiplactionScorePercent);
     System.out.printf("Division score: %d out of 4 (%.2f%%)%n", divisionScoreCorrect, divisionScorePercent);
     totalScorePercent = ((multiplactionScoreCorrect + divisionScoreCorrect)/8.0 *100);
     System.out.printf("Overall score: %d out of 8 (%.2f%%)%n", (multiplactionScoreCorrect + divisionScoreCorrect), totalScorePercent);      
  }
}
  







