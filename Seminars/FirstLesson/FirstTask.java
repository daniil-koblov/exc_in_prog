package Seminars.FirstLesson;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(createArray(array));;
    }

    public static int createArray(int[] array){
        int buf = array.length;
        if (buf < 1){
            return -1;
        }
        else return buf;
    }
}
