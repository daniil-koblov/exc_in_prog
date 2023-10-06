package PracticalWork.FirstWork.SecondTask;

class Answer {
    public int[] subArrays(int[] a, int[] b){
      if(a.length != b.length){
        return new int[]{0};
      }
      int[] c = new int[a.length];
      for (int i = 0; i < a.length; i++){
        c[i] = a[i] - b[i];
      }
      return c;
       
    }
}