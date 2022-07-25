/* Week 5 lab 
 * Calculator.java 
 * CSE 174: SECTION G
 * Ethan Gutknecht
 * Intsructor : Meisam Amjad 
 * Performs a variety of calculations based on user input. 
 */ 

import java.util.Scanner; 

public class Calculator { 
   public static void main(String[] args) { 
      double num1, num2, answer;
      String opCode;
      char opChar;
      Scanner in = new Scanner(System.in); 
      
            // Get the two numbers and the operator: 
      System.out.print("Enter an expression: "); 
      num1 = in.nextDouble(); 
      opCode = in.next(); 
      num2 = in.nextDouble(); 
      
      opChar = opCode.charAt(0);
      // Converting string into char
      
      switch (opChar) {
        case '+': //addition
          answer = num1 + num2; 
          System.out.printf("Addition: %.1f + %.1f = %.1f", num1, num2, answer);
          break;
          
        case '-': //subtractin
          answer = num1 - num2; 
          System.out.printf("Subtraction: %.1f - %.1f = %.1f", num1, num2, answer);
          break;
          
        case '*': //multiplication
          answer = num1 * num2; 
          System.out.printf("Multiplication: %.1f * %.1f = %.1f", num1, num2, answer);
          break;
          
        case '/': //division
          if (num2 == 0) { //check if second num is zero
            System.out.printf("Division: Divide by 0 error");
          }
          else { //run division
            answer = num1 / num2; 
            System.out.printf("Division: %.1f / %.1f = %.1f", num1, num2, answer);
          }
          break;
      
        case '^': //power
          answer = Math.pow(num1, num2);
          System.out.printf("Power: %.1f ^ %.1f = %.1f", num1, num2, answer);
          break;
          
        case '?': //random number
          if (num2 < num1) { //check if first num is bigger than second num
            System.out.printf("First number must be smaller than second number");
          }
          else { //run random number code
            answer = num1 + Math.random() * (num2 - num1);
            System.out.printf("Random number: %f", answer);
          }
          break;
          
        default: //invalid operator
          System.out.printf("Invalid operator");
          break;
      }
      
   }
} 
