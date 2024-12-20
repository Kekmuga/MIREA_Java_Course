package Pract_5;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


class First{
    static int EHOMEScore = 0;
    static int NaviScore = 0;
    static String lastScorer = "N/A";
    static JLabel resultLabel;
    static JLabel lastScorerLabel;
    static JLabel winLabel;

    public static void main(String args[]){

        JFrame frame = new JFrame("The International 2011");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.red);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.red);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBackground(Color.red);

        JButton button = new JButton("EHOME");
        button.setPreferredSize(new Dimension(300, 100));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EHOMEScore++;
                updateResult();
                lastScorer = "EHOME";
                lastScorerLabel();
                winner();
            }});
        buttonPanel.add(button);
        JButton button2 = new JButton("Natus Vincere");
        button2.setPreferredSize(new Dimension(300, 200));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NaviScore++;
                updateResult();
                lastScorer = "Natus Vincere";
                lastScorerLabel();
                winner();
            }});
        buttonPanel.add(button2, BorderLayout.WEST);

        panel.add(buttonPanel, BorderLayout.NORTH);


        resultLabel = new JLabel("Result: " + EHOMEScore + " X " + NaviScore);
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 28));
        textPanel.add(resultLabel, BorderLayout.NORTH);

        lastScorerLabel = new JLabel("Last Scorer:  " + lastScorer);
        lastScorerLabel.setHorizontalAlignment(JLabel.CENTER);
        lastScorerLabel.setFont(new Font("Arial", Font.BOLD, 22));
        textPanel.add(lastScorerLabel, BorderLayout.SOUTH);

        winLabel = new JLabel("Winner: None");
        winLabel.setHorizontalAlignment(JLabel.CENTER);
        winLabel.setFont(new Font("Arial", Font.BOLD, 22));
        textPanel.add(winLabel, BorderLayout.CENTER);

        panel.add(textPanel, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }
    static void updateResult() {
        resultLabel.setText("Result: " + EHOMEScore + " X " + NaviScore);
    }

    static void lastScorerLabel() {
        lastScorerLabel.setText("Last Scorer:  " + lastScorer);
    }

    static void winner() {
        if (EHOMEScore > NaviScore){
            winLabel.setText("Winner:  EHOME :<");
        } else if (NaviScore > EHOMEScore) {
            winLabel.setText("Winner:  NAVI :)");
        }
        else winLabel.setText("Winner:  Draw 0_0");
    }
}