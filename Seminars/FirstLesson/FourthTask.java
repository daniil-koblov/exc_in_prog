package Seminars.FirstLesson;

public class FourthTask {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, null, 13, null, null, 20};
        checkArray(array);
        }
    public static void checkArray(Integer[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                sb.append(i).append(" ");
            }
        }
        if(sb.length() != 0){
            throw new RuntimeException(sb.toString());
        }
    }
}