package Seminars.ThirdLesson.ThirdTask;

public class IndexOutOfBounds extends IndexOutOfBoundsException{
    public IndexOutOfBounds(){
        super("Выход за пределы массива.");
    }
    public IndexOutOfBounds(int i){
        super("Индекса " + i + " в массиве не существует.");
    }
}
