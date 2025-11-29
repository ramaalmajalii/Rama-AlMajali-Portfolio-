package CafeOOP;

public class OrderItem {
	// reference variable to the class, it can hold a reference to an object of the FoodItem class or any of its subclasses.
    // it allows for polymorphism
	private FoodItem foodItem;
    private int quantity;
    
    //constructor of this class.
    public OrderItem(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    //This method calculates and returns the total price of the `OrderItem`. It calls the `calculateTotalPrice()` method on the `foodItem` object, passing the `quantity` as an argument
    public double getTotalPrice() {
        return foodItem.calculateTotalPrice(quantity);
    }
}
	//this class represents items that are part of the order in the cafe


