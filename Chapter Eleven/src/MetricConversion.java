import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MetricConversion {
    JFrame frame;
    JPanel contentPane;
    JButton button;
    JLabel label, conversionList;
    JComboBox conversionBox;

    String[] conversions = {"inches to centimeters", "feet to meters", "gallons to liters", "pounds to kilograms"};

    public MetricConversion() {
            
            frame = new JFrame("MetricConversion");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            contentPane = new JPanel();
            contentPane.setLayout(new GridLayout(3, 1, 0, 10)); // Use GridLayout with 3 rows and 1 column
    
            conversionBox = new JComboBox(conversions);
            conversionBox.setSelectedIndex(0);
            conversionBox.addActionListener(e -> {
                String eventName = e.getActionCommand();
                if (eventName.equals("comboBoxChanged")) {
                    String conversion = (String) conversionBox.getSelectedItem();
                    if (conversion.equals("inches to centimeters")) {
                        label.setText("1 inch = 2.54 centimeters");
                    } else if (conversion.equals("feet to meters")) {
                        label.setText("1 foot = 0.3048 meters");
                    } else if (conversion.equals("gallons to liters")) {
                        label.setText("1 gallon = 4.5461 liters");
                    } else if (conversion.equals("pounds to kilograms")) {
                        label.setText("1 pound = 0.4536 kilograms");
                    }
                }
            });
            contentPane.add(conversionBox);

            label = new JLabel(" ");
            label.setHorizontalAlignment(JLabel.CENTER);
            contentPane.add(label);
    
            frame.setContentPane(contentPane);
    
            frame.pack();
            frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        MetricConversion greeting = new MetricConversion();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
        }
}
