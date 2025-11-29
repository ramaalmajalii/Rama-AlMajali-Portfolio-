package CafeOOP;
public class SpecialMenuItem extends MenuItem {
    private boolean isSpecial;

    public SpecialMenuItem(String name, double price, boolean isSpecial) {
        super(name, price);
        this.isSpecial = isSpecial;
    }

    public boolean isSpecial() {
        return isSpecial;
    }
}
