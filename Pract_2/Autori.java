package Pract_2;

import java.lang.*;
import java.util.Scanner;

public class Autori {
    public static class Auhto {
        private String name;
        private String email;
        private char gender;

        public Auhto(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "Name: " + name +
                    " \npol: " + gender +
                    " \nemail: " + email;
        }
    }
    public static void main (String[] args) {
            Auhto jija = new Auhto("Kucha", "lol@mail.ru", 'L');
            String new_email;
            System.out.println(jija.toString());
            Scanner sourse = new Scanner(System.in);
            System.out.println("\nWrite new email");
            new_email = sourse.nextLine();
            jija.setEmail(new_email);
            System.out.println(jija.toString());
    }
}