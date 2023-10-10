package Seminars.ThirdLesson.TaskFourth;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(){
        super();
    }
    public MyArraySizeException(int rows, int columns){
        super("Размер массива не 4 х 4, а " + rows + " х " + columns + ".");
    }
}
