/** 
 * Meisam Amjad
 * Lab13
 * Order Class 
 * used for creating Order Objects in the Shopping Cart.
 * Copyright(c) Nov 2019 
 */

public class Order {
   //---- Fields
   private int bar_code;
   private String name;
   private int units;
   private double price_unit;
   
   /** 
    * The Order constructor.  
    */
   public Order(int bar_code, String name, 
                int units, double price_unit) {
      setBar_code(bar_code);
      setName(name);
      setUnits(units);
      setPrice_unit(price_unit);
   }
   
   /**
    * Return the value of bar_code field.
    * @return int The bar_code value.
    */ 
   public int getBar_code() {
      return this.bar_code;
   }
   
   /**
    * Sets the given var_code inside the bar_code field.
    * @param int The new value for bar_code field.
    */ 
   public void setBar_code(int bar_code) {
      this.bar_code = bar_code;
   }
   
   /**
    * Returns the value of name field.
    * @return String The name value.
    */ 
   public String getName() {
      return this.name;
   }
   
   /**
    * Sets the given name into the name field.
    * @param String The new name for name field.
    */ 
   public void setName(String name) {
      this.name = name;
   }
   
   /**
    * Returns the value of units field.
    * @return int The value of units field.
    */ 
   public int getUnits() {
      return this.units;
   }
   
   /**
    * Sets the given value into the units field.
    * @param int The new value for units field.
    */ 
   public void setUnits(int units) {
      this.units = units;
   }
   
   /**
    * Returns the value of price_unit field.
    * @return double The value of price_unit
    */ 
   public double getPrice_unit() {
      return price_unit;
   }
   
   /**
    * Sets a new value into the price_unit field.
    * @param double The new value for price_unit field.
    */ 
   public void setPrice_unit(double price_unit) {
      this.price_unit = price_unit;
   }
   
   /**
    * Creates a single string for printing Order object.
    * @return String The output sting of Order object.
    */ 
   public String toString() {
      return  this.getBar_code() + "; " +
         this.getName() + "; " +
         this.getUnits() +"; " +
         this.getPrice_unit();
   }
   
   /**
    * Calculates the price of total price of this Order.
    * @return double The total price of the Order object.
    */ 
   public double calPrice() {
      return getUnits() * getPrice_unit();
   }
}
