package Seminars.FirstLesson;

public class ThirdTask {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0, 1, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 1}, {0, 1, 0, 1}};
        System.out.println(mehtod3(matrix));
        }
    public static int mehtod3(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length){
                throw new RuntimeException("Массив не квадратный: " +
                                        array.length + "X" + array[i].length);
            }
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] != 0 && array[i][j] != 1){
                    throw new RuntimeException("В массиве должны присутствовать только 0 и 1." + 
                                                "Элемент с индексом " + i + "," + j + " не равен 0 или 1.");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}