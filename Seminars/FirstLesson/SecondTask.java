package Seminars.FirstLesson;

public class SecondTask {
    public static void main(String[] args) {
        // int[] array = new int[]{1, 6, 13, 16, 19, 20};
        // int[] array = new int[]{};
        int[] array = null;
        mehtod2(array, 3);
    }

    public static int createArray(int[] array, int a){
        if (array == null){
                return -3;
            }
         int buf = array.length;
        if (buf < 1){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == a){
                return i;
            }
        }
        return -2;
    }

    public static void mehtod2(int[] array, int a){
        int buf = createArray(array, a);
        if (buf == -1){
            System.out.println("Длинна массива меньше " + 
                                "заданного минимума.");
        }
        else if (buf == -2){
            System.out.println("Искомый элемент не найден.");
        } 
        else if (buf == -3){
            System.out.println("Массив не имеет значений.");
        }
    }
}