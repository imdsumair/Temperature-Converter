import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TemperatureConverter extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton convertButton;

    public TemperatureConverter() {
        // Set up the window
        setTitle("Temperature Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Create components
        inputField = new JTextField(10);
        resultLabel = new JLabel("Fahrenheit: ");
        convertButton = new JButton("Convert");

        // Add components to the window
        add(new JLabel("Enter Celsius: "));
        add(inputField);
        add(convertButton);
        add(resultLabel);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        // Display the window
        setVisible(true);
    }

    private void convertTemperature() {
        try {
            // Get the input temperature in Celsius
            double celsius = Double.parseDouble(inputField.getText());

            // Convert to Fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;

            // Display the result
            resultLabel.setText("Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Enter a number.");
        }
    }

    public static void main(String[] args) {
        // Run the application
        new TemperatureConverter();
    }
}