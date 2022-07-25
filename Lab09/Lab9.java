import java.util.Scanner;


public class Lab9{
  public static boolean isEven(int numberinput){
    if (numberinput % 2 == 0) return true;
    else return false;
  }
  
  public static boolean multiple3or7(int numberinput){
    if (numberinput % 3 == 0 || numberinput % 7 == 0) return true;
    else return false;
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int maxValueOfMultiples = Integer.MIN_VALUE;
    int stepCount = 0;
    for (int q=0; q<5;q++){
      
      //System.out.println("Enter a start point:");
      //int startPoint = scan.nextInt();
      int startPoint =  1000 + (int)(Math.random()*(20000 - 1000 + 1));
      //System.out.println("Enter a end point:");
      //int endPoint = scan.nextInt();
      int endPoint = 20000 + (int)(Math.random()*(50000 - 20000 + 1));
      int numberOfMultiplesOf3or7 = 0;
      
      for(int i=startPoint; i <= endPoint; i++){
        int squenceOutput = 0;
        if (isEven(i) == false) squenceOutput = (i*2);
        if (isEven(i) == true)  squenceOutput = (i*-2)+1;
        //System.out.print(squenceOutput + " ");
        if (multiple3or7(squenceOutput) == true) numberOfMultiplesOf3or7 += 1;
        if (maxValueOfMultiples < numberOfMultiplesOf3or7){
          maxValueOfMultiples = numberOfMultiplesOf3or7;
          stepCount = q;
        }
      }
      System.out.println(startPoint+ "-" + endPoint + ": " + numberOfMultiplesOf3or7 + " multiple of 3 or 7.");
    } 
    System.out.println("Max is: " + maxValueOfMultiples + " from step "+ stepCount +".");
  }
  
}