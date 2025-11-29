package CafeOOP;

//this class inherits all fields and methods in the FoodItem class.
public class MenuItem extends FoodItem {
	// the constructor of this class takes two parameters
    public MenuItem(String name, double price) {
        super(name, price);//invokes the constructor in FoodItem
    }
}