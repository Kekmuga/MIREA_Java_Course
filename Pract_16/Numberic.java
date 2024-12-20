package Pract_16;

import javax.swing.*;
import java.awt.*;

public class Numberic extends JFrame {
    private final int secretNumber;
    private int attemptsLeft = 3;
    private final JTextField textField;
    private final JLabel resultLabel1;
    private final JLabel resultLabel2;


    public Numberic() {
        setTitle("Угадай число");
        setSize(400, 400);
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.CENTER);

        JButton guessButton = new JButton("Угадать");
        guessButton.addActionListener(e -> checkGuess());
        add(guessButton, BorderLayout.SOUTH);

        resultLabel1 = new JLabel("", SwingConstants.CENTER);
        resultLabel2 = new JLabel("", SwingConstants.CENTER);
        JPanel res = new JPanel(new BorderLayout());
        res.add(resultLabel1, BorderLayout.AFTER_LAST_LINE);
        res.add(resultLabel2, BorderLayout.CENTER);
        add(res, BorderLayout.EAST);
        secretNumber = (int) (Math.random() * 21);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void checkGuess() {
        try {
            int userGuess = Integer.parseInt(textField.getText());

            if (userGuess == secretNumber) {
                resultLabel2.setText("Поздравляем! Вы угадали число.");
                textField.setEnabled(false);
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0 && secretNumber < userGuess){
                    resultLabel2.setText("Неправильно. загаданное число меньше.");
                    resultLabel1.setText("Осталось попыток: " + attemptsLeft);
                } else if (attemptsLeft > 0 && secretNumber > userGuess) {
                    resultLabel2.setText("Неправильно. загаданное число больше.");
                    resultLabel1.setText("Осталось попыток: " + attemptsLeft);
                } else {
                    resultLabel2.setText("Вы исчерпали все попытки.");
                    resultLabel1.setText("Загаданное число: " + secretNumber);
                    textField.setEnabled(false);
                }
            }
        } catch (NumberFormatException ex) {
            resultLabel2.setText("Введите число от 0 до 20");
        }
    }

    public static void main(String[] args) {
        new Numberic();
    }
}
