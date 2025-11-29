package CafeOOP;

import java.util.Scanner;

public class CafeDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("Welcome to Java Coffee!");
        System.out.println();

        FoodItem[] hotItems = {
                new SpecialMenuItem("Cappuccino    ", 2.50, false),
                new SpecialMenuItem("Spanish Latte    ", 3.50, true),
                new SpecialMenuItem("Mocha             ", 4.0, false),
                new SpecialMenuItem("Flat White    ", 3.0, false),
                new SpecialMenuItem("Cinnamon Coffee    ", 3.50, true),
                new MenuItem("Exit             ", 0)
        };

        FoodItem[] coldItems = {
                new MenuItem("Ice Latte       ", 4.50),
                new MenuItem("Cold Brew      ", 3.50),
                new MenuItem("Peach Ice Tea  ", 4.0),
                new MenuItem("Strawberry Ice Tea ", 4.0),
                new MenuItem("Milkshake          ", 4.50),
                new MenuItem("Exit             ", 0)
        };

        FoodItem[] snacksItems = {
                new MenuItem("Turkey Sandwich    ", 3.50),
                new MenuItem("Chicken Sandwich    ", 3.75),
                new MenuItem("Veggie Pizza    ", 4.0),
                new MenuItem("Caesar Salad   ", 3.0),
                new MenuItem("Fries           ", 1.50),
                new MenuItem("Exit             ", 0)
        };

        FoodItem[] dessertItems = {
                new MenuItem("Cheesecake    ", 3.0),
                new MenuItem("Brownie       ", 1.0),
                new MenuItem("Red Velvet Cake    ", 2.50),
                new MenuItem("Carrot Cake    ", 2.50),
                new MenuItem("Chocolate Cookies", 1.0),
                new MenuItem("Exit             ", 0)
        };

        Menu hotMenu = new Menu(hotItems);
        Menu coldMenu = new Menu(coldItems);
        Menu snacksMenu = new Menu(snacksItems);
        Menu dessertMenu = new Menu(dessertItems);

        Order order = new Order();

        // Process for HOT DRINKS
        System.out.println("Please choose items from the HOT DRINKS menu :)");
        System.out.println("HOT DRINKS " + "\t\t\tPrice");
        for (int i = 0; i < hotMenu.getNumItems(); i++) {
            FoodItem item = hotMenu.getItem(i);
            System.out.println((i + 1) + "." + item.getName() + "\t\t" + item.getPrice());
        }
        int choiceHot = input.nextInt();
        if (choiceHot > 0 && choiceHot < 6 && choiceHot <= hotMenu.getNumItems()) {
            System.out.println("Enter the amount of " + hotMenu.getItem(choiceHot - 1).getName());
            int amount = input.nextInt();
            order.addItem(new OrderItem(hotMenu.getItem(choiceHot - 1), amount));
        }

        // Process for COLD DRINKS
        System.out.println("Please choose items from the COLD DRINKS menu :)");
        System.out.println("COLD DRINKS" + "\t\t\tPrice");
        for (int i = 0; i < coldMenu.getNumItems(); i++) {
            FoodItem item = coldMenu.getItem(i);
            System.out.println((i + 1) + "." + item.getName() + "\t\t" + item.getPrice());
        }
        int choiceCold = input.nextInt();
        if (choiceCold > 0 && choiceCold < 6 && choiceCold <= coldMenu.getNumItems()) {
            System.out.println("Enter the amount of " + coldMenu.getItem(choiceCold - 1).getName());
            int amount = input.nextInt();
            order.addItem(new OrderItem(coldMenu.getItem(choiceCold - 1), amount));
        }

        // Process for SNACKS
        System.out.println("Please choose items from the SNACKS menu :)");
        System.out.println("SNACKS" + "\t\t\tPrice");
        for (int i = 0; i < snacksMenu.getNumItems(); i++) {
            FoodItem item = snacksMenu.getItem(i);
            System.out.println((i + 1) + "." + item.getName() + "\t\t" + item.getPrice());
        }
        int choiceSnacks = input.nextInt();
        if (choiceSnacks > 0 && choiceSnacks < 6 && choiceSnacks <= snacksMenu.getNumItems()) {
            System.out.println("Enter the amount of " + snacksMenu.getItem(choiceSnacks - 1).getName());
            int amount = input.nextInt();
            order.addItem(new OrderItem(snacksMenu.getItem(choiceSnacks - 1), amount));
        }

        // Process for DESSERTS
        System.out.println("Please choose items from the DESSERTS menu :)");
        System.out.println("DESSERTS" + "\t\t\tPrice");
        for (int i = 0; i < dessertMenu.getNumItems(); i++) {
            FoodItem item = dessertMenu.getItem(i);
            System.out.println((i + 1) + "." + item.getName() + "\t\t" + item.getPrice());
        }
        int choiceDessert = input.nextInt();
        if (choiceDessert > 0 &&  choiceDessert < 6 &&choiceDessert <= dessertMenu.getNumItems()) {
            System.out.println("Enter the amount of " + dessertMenu.getItem(choiceDessert - 1).getName());
            int amount = input.nextInt();
            order.addItem(new OrderItem(dessertMenu.getItem(choiceDessert - 1), amount));
        }

        // Print Order Confirmation
        System.out.println("Order Confirmation:\n");
        for (OrderItem orderItem : order.getOrderItems()) {
            FoodItem foodItem = orderItem.getFoodItem();
            int quantity = orderItem.getQuantity();
            double totalPrice = orderItem.getTotalPrice();
            System.out.println(foodItem.getName() + " * " + quantity + " = " + totalPrice + " JDs");
        }

        
        System.out.println("Would you like to split the bill?ENTER 1 for yes and 0 for no");
 	   int answer = input.nextInt();
 	   System.out.println();
 	   
 	   
        if (answer == 1) {
     	   System.out.println("How many people will you split the bill with?");
     	   int people = input.nextInt();
     	   try {
     		  double totalBill = order.getTotalBill();
     		  totalBill = totalBill / people;
     		  System.out.println("Your total bill = "+totalBill);
     		  System.out.println("Thank you!Enjoy!");}
     	   		catch (ArithmeticException e) {
     	   			System.err.println(e.getMessage());
     	   		}finally {
     	   			System.out.println("end of try/catch code");
     	   		}
        }
        else if (answer == 0){
        double totalBill = order.getTotalBill();
     	   System.out.println("Your total bill = "+totalBill);
     	   System.out.println("Thank you!Enjoy!");
             
        }
      
    }
}


