package Pract_19_onis.Task1;

import java.util.Scanner;

public class Main {
    public static void checkInn(String inn) throws InnNotValidException{
        if (inn.length() != 10 && inn.length() != 12)
            throw new InnNotValidException(inn);
        if (inn.toCharArray()[0] == '0' & inn.toCharArray()[1] == '0')
            throw new InnNotValidException(inn);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите номер ИНН");
            try{
                String inn = sc.next();
                checkInn(inn);
                break;
            } catch (InnNotValidException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }
}
