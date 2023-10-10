package Seminars.ThirdLesson.ThirdTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFound {
        // int a = 1;
        // int b = 0;

        // try {
        //     int c = a/b;
        // } catch (ArithmeticException e) {
        //     throw new DivisionByZeroException();
        // }
        
        // int[] array = new int[3];
        // int j = 9;
        // try{
        //     int i = array[j];
        // } catch (IndexOutOfBoundsException e){
        //     throw new IndexOutOfBounds(j);
        // }

        String path = "alhfhghfr";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            System.out.println("hfdsfhdfhj");
        } catch (FileNotFoundException e){
            throw new FileNotFound(path);
        } catch (IOException e){
            throw new RuntimeException();
        }
    }
}
