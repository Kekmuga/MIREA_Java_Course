package Pract_2;

import java.lang.*;
import java.util.Scanner;

public class Catcaf {
    public static class Catus {
        private String name;
        private double age;

        public Catus(double age, String name) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public double getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(double age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "author = '" + name + '\'' +
                    ", age = " + age ;
        }

        public double human_age(){
            return age * 7;
        }
    }

    public static void main(String[] args) {
        Catus[] Catcafe;
        Integer cat_number;
        Scanner sourse = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Print the amount of cats: ");
        cat_number = sourse.nextInt();
        Catcafe = new Catus[cat_number];
        for (int i = 1; i < cat_number+1; i++){
            String name;
            Integer age = -1;
            System.out.println("Print the author of " + i + " cat: ");
            name = scan.nextLine();
            while (age < 0){
                System.out.println("Print the age of " + i + " cat: ");
                age = sourse.nextInt();
                if (age < 0) System.out.println("Impossible");
            }
            Catcafe[i-1] = new Catus(age, name);
        }
        for (Catus cat : Catcafe){
            System.out.println(cat.toString() + ", In human age " + cat.human_age());
        }
    }
}