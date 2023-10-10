package Seminars.ThirdLesson;

import java.io.IOException;

public class FirstTask {

    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void doSomething() throws IOException{

    }
}