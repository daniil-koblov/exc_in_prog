package PracticalWork.FirstWork.FirstTask;

class Answer {
    public static void arrayOutOfBoundsException() {
     int[] arr = new int[]{0, 1, 2, 3};
     System.out.println(arr[4]);
}

    public static void divisionByZero() {
      int a = 1;
      int b = 0;
      System.out.println(a / b);
}

    public static void numberFormatException() {
       String numberString = "abc";
            int number = Integer.parseInt(numberString);
            System.out.println(number);
 }
}
