import java.util.*;

/**
 * Ethan Gutknecht
 * Section G:
 * 
 * Shopping Cart Application Template
 * Complete the missing code in the program
 */
public class Lab13ShoppingApp {
   static Scanner scan = new Scanner(System.in);
   /* main method */
   public static void main(String[] args) {
      //create cart object with the capacity of 10 orders
      ShoppingCart cart = new ShoppingCart(10);
      String answer;
      boolean exit = false;
      
      while(!exit) {
         char op = menu();
         answer = "";
         switch (op) {
            case 'A': //add item
               cart.addOrder(readOrderFromKeyboard());
               break;
            case 'B': //lists
               cart.listOrders();
               break;
               
            case 'C': //lists order and price
               cart.listOrders(); //lists order
               System.out.printf("Total: $%.2f", cart.getBill()); //gets order
               System.out.printf("%n %15s","Are you sure? (yes/no):");
               answer = scan.next(); //asks user if they are sure
               break;
               
            case 'X': //exits 
               System.out.printf("%n %15s","Are you sure? (yes/no):"); //asks user if they are sure
               answer = scan.next();
               if (answer.equalsIgnoreCase("yes")) exit = true; //if yes exit
               break;
               
            default: System.out.println("Wrong Option"); 
         }
        
      }
      
   }
   
   /**
    * prints a menu and returns a chosen option.
    * @return char The chosen option from the menu.
    */ 
   public static char menu() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nShopping Cart App");
      System.out.println("\tA. Add an item to the Shopping Cart");
      System.out.println("\tB. List items in the Shopping Cart");
      System.out.println("\tC. Pay the bill");
      System.out.println("\tX. Exit");
      System.out.println();
      System.out.print("Option:"); 
      
      return keyboard.next().toUpperCase().charAt(0);
        
   }
   
   
   public static Order readOrderFromKeyboard() {
      //TODO - step1
     int bar_code;
     String name;
     int units;
     double price_unit;
     System.out.println("**Enter the Details:");
     System.out.printf("%15s","Bar Code:"); //bar code
     bar_code = scan.nextInt();
     
     System.out.printf("%15s","Name:"); //name
     name = scan.next();
     
     System.out.printf("%15s","Units:"); //units
     units = scan.nextInt();
     
     System.out.printf("%15s","Unit Price:"); //price
     price_unit = scan.nextDouble();
      
      return (new Order(bar_code, name, units, price_unit));
   }
}
