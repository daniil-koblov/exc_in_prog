package Seminars.ThirdLesson.ThirdTask;

public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException(){
        super("Деление на ноль запрещено!");
    }
}
