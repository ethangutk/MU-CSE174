import java.util.*;

/**
 * Meisam Amjad
 * Lab13
 * ShoppingCart class.
 * Used for creating cart Objects.
 */
public class ShoppingCart {
   private Order[] orders;
   private int count;
   
   /**
    * Constructor and initilizes the orders field 
    * as an array of n elements
    * @param int The capacity of shopping cart
    */ 
   public ShoppingCart(int n) {
      this.orders = new Order[n];
      this.count = 0;
   }
   
   /**
    * Returns the value of Orders field.
    * @return Orders[] The orders field.
    */ 
   public Order[] getOrders() {
      return this.orders;
   }
   /**
    * Displays all orders
    */ 
   public void listOrders() {
      if (size() == 0)
         System.out.println("No orders placed yet!");
      else {
         System.out.println("Orders placed in the Cart!");
         for(Order o: this.orders)
            if (o != null) System.out.println(o);
      }
   }
   
   /**
    * Returns the count of the orders inside 
    * the shoping list.
    * @return int The count of items inside the shoping list.
    */ 
   public int size() {
      return this.count;
   }
   
   /**
    * Adds a new order to the shopping list.
    * @param int bar_code
    * @param String name
    * @param int units
    * @param double price_units
    * @return boolean successful/unsuccessful
    */
   public boolean addOrder(Order o) {
      if (size() == this.orders.length) {
         System.out.println("The shipping list is full");
         return false;  // Unsuccessful
      }
      
      // After running this line the variable Orders
      // at the index of count refers to the given Order o
      this.orders[size()] = o;
   
      // Increasing the value of count by 1.
      this.count ++ ;
      
      return true;  // Successful
   }
   
   /**
    * Returns a bill from all orders
    * @return double The total orders price.
    */ 
   public double getBill() {
      double bill = 0.0;
      // Calculating the price of all orders
      for(Order o: this.orders)
         bill += (o != null)? o.calPrice(): 0;
      
      return bill;
   }
}
