package Seminars.ThirdLesson.SecondTask;

public class Main {
    public static void main(String[] args) {

        try (Counter counter = new Counter(2)){
            counter.add();
            counter.close();
            counter.add();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
