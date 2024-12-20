package Pract_12;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

class Animata {
    static int EHOMEScore = 0;
    static int NaviScore = 0;
    static String lastScorer = "N/A";
    static JLabel resultLabel;
    static JLabel lastScorerLabel;
    static JLabel winLabel;
    static ImageIcon[] frames;
    static ImageIcon[] frames2; // Используем ImageIcon для JLabel
    static Timer animationTimer;  // Таймер для анимации
    static int currentFrame = 0;  // Текущий кадр

    public static void main(String args[]) {
        // Загружаем изображения в массив frames как ImageIcon для использования в JLabel
        try {
            frames = new ImageIcon[]{
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\1.png"))),
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\2.png"))),
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\3.png"))),
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\4.png"))),
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\5.png")))
            };
        } catch (IOException e) {
            System.out.println("lol");
        }
        try{
            frames2 = new ImageIcon[]{
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\c1.png"))),
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\c2.jpg"))),
                    new ImageIcon(ImageIO.read(new File("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\Twelwe\\c3.png")))
            };
        } catch (IOException e){
            System.out.println("lol1");
        }

        // Создаем основное окно программы
        JFrame frame = new JFrame("The International 2011");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.red);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.red);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBackground(Color.red);

        // Кнопка для команды EHOME
        JButton button = new JButton("EHOME");
        button.setPreferredSize(new Dimension(300, 100));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EHOMEScore++;
                updateResult();
                lastScorer = "EHOME";
                lastScorerLabel();
                winner();
            }
        });
        buttonPanel.add(button);

        // Кнопка для команды Natus Vincere
        JButton button2 = new JButton("Natus Vincere");
        button2.setPreferredSize(new Dimension(300, 200));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NaviScore++;
                updateResult();
                lastScorer = "Natus Vincere";
                lastScorerLabel();
                winner();  // Запуск анимации при достижении победы
            }
        });
        buttonPanel.add(button2, BorderLayout.WEST);

        panel.add(buttonPanel, BorderLayout.NORTH);

        // Метка с результатом
        resultLabel = new JLabel("Result: " + EHOMEScore + " X " + NaviScore);
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 28));
        textPanel.add(resultLabel, BorderLayout.NORTH);

        // Метка с последним забившим
        lastScorerLabel = new JLabel("Last Scorer:  " + lastScorer);
        lastScorerLabel.setHorizontalAlignment(JLabel.CENTER);
        lastScorerLabel.setFont(new Font("Arial", Font.BOLD, 22));
        textPanel.add(lastScorerLabel, BorderLayout.SOUTH);

        // Метка с победителем (будем использовать для анимации)
        winLabel = new JLabel("Winner: None", SwingConstants.CENTER);
        winLabel.setFont(new Font("Arial", Font.BOLD, 22));
        winLabel.setHorizontalAlignment(JLabel.CENTER);
        textPanel.add(winLabel, BorderLayout.CENTER);  // winLabel в центре панели

        panel.add(textPanel, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    // Обновление результата на экране
    static void updateResult() {
        resultLabel.setText("Result: " + EHOMEScore + " X " + NaviScore);
    }

    // Обновление метки с последним забившим
    static void lastScorerLabel() {
        lastScorerLabel.setText("Last Scorer:  " + lastScorer);
    }

    // Метод, который запускает анимацию победы в JLabel (winLabel)
    static void winner() {
        winLabel.setText("");
        winLabel.setIcon(null);

        // Остановка предыдущего таймера, если он запущен
        if (animationTimer != null) {
            animationTimer.stop();
        }

        // Сбрасываем текущий кадр на первый
        currentFrame = 0;
        if (EHOMEScore > NaviScore){
            animationTimer = new Timer(150, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Переключаем кадры анимации
                    currentFrame = (currentFrame + 1) % frames2.length;
                    winLabel.setIcon(frames2[currentFrame]);  // Обновляем изображение в winLabel
                }
            });
            animationTimer.start();
        } else if (NaviScore > EHOMEScore) {
            animationTimer = new Timer(400, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Переключаем кадры анимации
                    currentFrame = (currentFrame + 1) % frames.length;
                    winLabel.setIcon(frames[currentFrame]);  // Обновляем изображение в winLabel
                }
            });
            animationTimer.start();
        } else winLabel.setText("Winner:  Draw 0_0");
    }
}