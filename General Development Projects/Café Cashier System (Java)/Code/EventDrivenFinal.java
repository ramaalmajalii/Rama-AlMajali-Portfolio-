import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class EventDrivenFinal extends JFrame {
    private JComboBox<String> hotComboBox;
    private JComboBox<String> coldComboBox;
    private JComboBox<String> snacksComboBox;
    private JComboBox<String> dessertComboBox;

    private JButton orderButton;

    private String[] hotItems = {"Cappuccino", "Spanish Latte", "Mocha", "Flat White", "Cinnamon Coffee", "Proceed"};
    private double[] hotPrices = {2.50, 3.50, 4.0, 3.0, 3.50, 0};

    private String[] coldItems = {"Ice Latte", "Cold Brew", "Peach Ice Tea", "Strawberry Ice Tea", "Milkshake", "Proceed"};
    private double[] coldPrices = {4.50, 3.50, 4.0, 4.0, 4.50, 0};

    private String[] snacksItems = {"Turkey Sandwich", "Chicken Sandwich", "Veggie Pizza", "Caesar Salad", "Fries", "Proceed"};
    private double[] snacksPrices = {3.50, 3.75, 4.0, 3.0, 1.50, 0};

    private String[] dessertItems = {"Cheesecake", "Brownie", "Red Velvet Cake", "Carrot Cake", "Chocolate Cookies", "Proceed"};
    private double[] dessertPrices = {3.0, 1.0, 2.50, 2.50, 1.0, 0};

    public EventDrivenFinal() {
        super("Java Coffee");

        setLayout(new FlowLayout());

        hotComboBox = new JComboBox<>(hotItems);
        coldComboBox = new JComboBox<>(coldItems);
        snacksComboBox = new JComboBox<>(snacksItems);
        dessertComboBox = new JComboBox<>(dessertItems);

        orderButton = new JButton("Place Order");

        add(new JLabel("Hot Drinks: "));
        add(hotComboBox);
        add(new JLabel("Cold Drinks: "));
        add(coldComboBox);
        add(new JLabel("Snacks: "));
        add(snacksComboBox);
        add(new JLabel("Dessert: "));
        add(dessertComboBox);
        add(orderButton);

        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placeOrder();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void placeOrder() {
        double total = 0.0;

        int hotIndex = hotComboBox.getSelectedIndex();
        int coldIndex = coldComboBox.getSelectedIndex();
        int snacksIndex = snacksComboBox.getSelectedIndex();
        int dessertIndex = dessertComboBox.getSelectedIndex();

        if (hotIndex >= 0 && hotIndex < 5) {
            int hotQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of " + hotItems[hotIndex]));
            total += hotPrices[hotIndex] * hotQuantity;
        }

        if (coldIndex >= 0 && coldIndex < 5) {
            int coldQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of " + coldItems[coldIndex]));
            total += coldPrices[coldIndex] * coldQuantity;
        }

        if (snacksIndex >= 0 && snacksIndex < 5) {
            int snacksQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of " + snacksItems[snacksIndex]));
            total += snacksPrices[snacksIndex] * snacksQuantity;
        }

        if (dessertIndex >= 0 && dessertIndex < 5) {
            int dessertQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of " + dessertItems[dessertIndex]));
            total += dessertPrices[dessertIndex] * dessertQuantity;
        }

        int answer = JOptionPane.showConfirmDialog(null, "Would you like to split the bill?", "Split Bill", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_OPTION) {
            int people = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people will you split the bill with?"));
            total /= people;
        }

        JOptionPane.showMessageDialog(null, "Your total bill is: $" + total, "Total Bill", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Thank you! Enjoy!", "Thank You", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDrivenFinal();
            }
        });
    }
}
