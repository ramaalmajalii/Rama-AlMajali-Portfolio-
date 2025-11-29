
package CafeOOP;

public class FoodItem {
	 private String name;
	 private double price;
	 	//constructor of the FoodItem class
	    public FoodItem(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    
	    //getter method that returns the name of the food item.
	    public String getName() {
	        return name;
	    }
	    
	    //getter method that returns the price of the food item.
	    public double getPrice() {
	        return price;
	    }
	    //a method to calculate the total price of the food item.
	    // it takes quantity as a parameter
	    public double calculateTotalPrice(int quantity) {
	        return price * quantity;
	    }
	}
		// the purpose of the `FoodItem` class is to represent and manage the properties of individual food items in the cafe
		//it provides a convenient way to store, access, and calculate information about them.







  


