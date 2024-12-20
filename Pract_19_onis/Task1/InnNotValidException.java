package Pract_19_onis.Task1;

public class InnNotValidException extends Exception{
    private String innNum;

    public InnNotValidException(String innNum) {
        super("ИНН c номером " + innNum + " не действителен!");
    }

    public String getInnNum() {
        return innNum;
    }
}
