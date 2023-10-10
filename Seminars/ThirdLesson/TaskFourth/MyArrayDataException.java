package Seminars.ThirdLesson.TaskFourth;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("Не удалось выполнить преобразование.");
    }

    public MyArrayDataException(int i, int j){
        super("Не удалось выполнить преобразование в ячейке: " + i + " х " + j + ".");
    }
}
