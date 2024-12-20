package Pract_5;
import javax.swing.*;
import java.awt.*;

public class Second{
    public static void main(String[] args) {
        Image img = new ImageIcon("C:\\Users\\Kelman\\IdeaProjects\\Lol\\src\\The_fifth\\ded.jpg").getImage();

        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JPanel() {
            protected void paintComponent(Graphics g) {
                g.drawImage(img, 0, 0, null);
            }
        });

    }
}
