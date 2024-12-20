package Pract_16;

import javax.swing.*;
import java.awt.*;

public class Fontes {
    static class fonts extends JFrame {
        fonts(String s) {
            setSize(800, 100);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);

            JRadioButton blue = new JRadioButton("Синий");
            blue.setBounds(110, 20, 80, 20);
            blue.setForeground(Color.BLUE);
            add(blue);

            JRadioButton red = new JRadioButton("Красный");
            red.setBounds(200, 20, 80, 20);
            red.setForeground(Color.RED);
            add(red);

            JRadioButton black = new JRadioButton("Чёрный");
            black.setBounds(290, 20, 80, 20);
            black.setForeground(Color.BLACK);
            add(black);


            ButtonGroup bg = new ButtonGroup();
            bg.add(blue);
            bg.add(red);
            bg.add(black);

            JRadioButton times = new JRadioButton("TimesNewRoman");
            times.setBounds(30, 60, 150, 20);
            times.setFont(new Font("TimesNewRoman", Font.PLAIN, 14));
            add(times);
            JRadioButton cn = new JRadioButton("Broadway");
            cn.setBounds(200, 60, 120, 20);
            cn.setFont(new Font("Broadway", Font.PLAIN, 14));
            add(cn);
            JRadioButton cg = new JRadioButton("Courier New");
            cg.setBounds(350, 60, 120, 20);
            cg.setFont(new Font("Courier New", Font.PLAIN, 14));
            add(cg);

            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(times);
            bg2.add(cn);
            bg2.add(cg);

            setLayout(new FlowLayout());
            JTextArea textArea = new JTextArea("     ");



            textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 20));
            add(textArea);

            cg.addActionListener(e -> textArea.setFont(cg.getFont()));
            cn.addActionListener(e -> textArea.setFont(cn.getFont()));
            times.addActionListener(e -> textArea.setFont(times.getFont()));
            red.addActionListener(e -> textArea.setForeground(Color.RED));
            blue.addActionListener(e -> textArea.setForeground(Color.BLUE));
            black.addActionListener(e -> textArea.setForeground(Color.BLACK));
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Fontes.fonts("Замена шрифта");
    }
}