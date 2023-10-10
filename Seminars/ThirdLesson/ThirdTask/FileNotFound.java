package Seminars.ThirdLesson.ThirdTask;

import java.io.FileNotFoundException;

public class FileNotFound extends FileNotFoundException{
    public FileNotFound(){
        super("Файл не найден.");
    }

    public FileNotFound(String path){
        super("Файл с путем " + path + " не найден.");
    }
}
