package CafeOOP;

public class Menu {
    private FoodItem[] items;

    public Menu(FoodItem[] items) {
        this.items = items;
    }

    public int getNumItems() {
        return items.length;
    }

    public FoodItem getItem(int index) {
        return items[index];
    }
}


