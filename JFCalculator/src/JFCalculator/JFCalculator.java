package JFCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JFCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        frame.add(buttonPanel, BorderLayout.CENTER);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        CalculatorButtonListener listener = new CalculatorButtonListener(textField);

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
            button.addActionListener(listener);
        }

        frame.setVisible(true);
    }

    static class CalculatorButtonListener implements ActionListener {
        private JTextField textField;

        public CalculatorButtonListener(JTextField textField) {
            this.textField = textField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonLabel = button.getText();

            if (buttonLabel.equals("=")) {
                String expression = textField.getText();
                try {
                    double result = evaluateExpression(expression);
                    textField.setText(Double.toString(result));
                } catch (ArithmeticException ex) {
                    textField.setText("Error");
                }
            } else {
                textField.setText(textField.getText() + buttonLabel);
            }
        }

        private double evaluateExpression(String expression) {
            try {
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("JavaScript");

                if(engine != null) {
                    Object result = engine.eval(expression);
                    if (result instanceof Number) {
                        return ((Number) result).doubleValue();
                    } else {
                        throw new ArithmeticException("Invalid expression");
                    }
                }

            } catch (ScriptException e) {
                throw new ArithmeticException("Invalid expression");
            }
            return 0;
        }
    }
}

