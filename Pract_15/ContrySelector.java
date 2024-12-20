package Pract_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContrySelector extends JFrame {

    private JComboBox<String> countryComboBox;
    private JLabel countryInfoLabel;

    public ContrySelector() {
        setTitle("Country Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());


        String[] countries = {
                "United States", "Canada", "Russia", "United Kingdom", "Germany", "France", "Japan", "China", "India", "Australia"
        };

        countryComboBox = new JComboBox<>(countries);
        add(countryComboBox, BorderLayout.NORTH);
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCountryInfo();
            }
        });

        countryComboBox.setPreferredSize(new Dimension(300, 30));
        countryInfoLabel = new JLabel();
        countryInfoLabel.setPreferredSize(new Dimension(300, 100));
        countryInfoLabel.setHorizontalAlignment(JLabel.CENTER);

        add(countryComboBox, BorderLayout.NORTH);
        add(countryInfoLabel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void showCountryInfo() {
        String selectedCountry = (String) countryComboBox.getSelectedItem();
        String info = "";

        switch (selectedCountry) {
            case "United States":
                info = "Capital: Washington, D.C.\nContinent: North America";
                break;
            case "Canada":
                info = "Capital: Ottawa \nContinent: North America";
                break;
            case "Russia":
                info = "Capital: Moscow \nContinent: Eurasia";
                break;
            case "United Kingdom":
                info = "Capital: London \nContinent: Europe";
                break;
            case "Germany":
                info = "Capital: Berlin \nContinent: Europe";
                break;
            case "France":
                info = "Capital: Paris \nContinent: Europe";
                break;
            case "Japan":
                info = "Capital: Tokyo \nContinent: Asia";
                break;
            case "China":
                info = "Capital: Beijing \nContinent: Asia";
                break;
            case "India":
                info = "Capital: New Delhi \nContinent: Asia";
                break;
            case "Australia":
                info = "Capital: Canberra \nContinent: Oceania";
                break;
            default:
                info = "No information available.";
        }

        countryInfoLabel.setText(info);
    }


    public static void main(String[] args) {
        new ContrySelector();
    }
}