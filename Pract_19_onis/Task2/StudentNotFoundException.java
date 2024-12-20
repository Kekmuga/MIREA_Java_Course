package Pract_19_onis.Task2;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super("Студент с ФИО " + message + " не найден");
    }
}
