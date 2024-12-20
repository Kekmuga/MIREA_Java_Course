package Practz_22_oka;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Bobre_calc extends JFrame {
    private JTextField displayField;  // Поле для отображения выражения
    private StringBuilder expression = new StringBuilder();  // Хранение введенного выражения

    public Bobre_calc() {
        // Настройка окна
        setTitle("Bobre_calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создание дисплея для выражений
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.PLAIN, 35));
        displayField.setBackground(Color.WHITE);
        displayField.setBorder(new LineBorder(Color.GRAY, 2));

        // Создание панели с кнопками
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));  // Изменение на 5 строк (для кнопки пробела)

        // Кнопки для чисел и операторов
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "+", "="
        };

        // Добавление кнопок на панель
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        // Добавление кнопки пробела
        JButton spaceButton = new JButton(" ");
        spaceButton.setFont(new Font("Arial", Font.PLAIN, 25));
        spaceButton.addActionListener(new ButtonClickListener());

        // Добавление компонентов в окно
        setLayout(new BorderLayout());
        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(spaceButton, BorderLayout.SOUTH);
    }

    // Слушатель для обработки нажатий кнопок
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("=".equals(command)) {
                try {
                    double result = calculateRPN(expression.toString());
                    displayField.setText(Double.toString(result));  // Отображение результата
                    expression.setLength(0);  // Очистка выражения после расчета
                } catch (Exception ex) {
                    displayField.setText("Error");
                    expression.setLength(0);
                }
            } else if (" ".equals(command)) {
                expression.append(" ");  // Добавляем пробел в выражение
                displayField.setText(expression.toString());
            } else {
                expression.append(command);  // Добавление нажатой кнопки в выражение
                displayField.setText(expression.toString());
            }
        }
    }

    // Метод для вычисления выражения в обратной польской нотации
    private double calculateRPN(String expr) throws Exception {
        String[] tokens = expr.split("\\s+");  // Разбиваем строку на отдельные элементы по пробелам
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+")) {  // Если это число
                stack.push(Double.parseDouble(token));
            } else {  // Если это оператор
                double a = stack.pop();
                double b = stack.pop();
                switch (token) {
                    case "+" -> stack.push(b + a);
                    case "-" -> stack.push(b - a);
                    case "*" -> stack.push(b * a);
                    case "/" -> {
                        if (a == 0) throw new ArithmeticException("Division by zero");
                        stack.push(b / a);
                    }
                }
            }
        }

        if (stack.size() > 1) throw new Exception("Invalid Expression");
        return stack.pop();
    }

    public static void main(String[] args) {
        Bobre_calc calculator = new Bobre_calc();
        calculator.setVisible(true);
    }
}
