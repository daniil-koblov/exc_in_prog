package Seminars.SecondLesson;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        String s = "C:\\Users\\User\\Desktop\\programming lessons\\exc_in_prog\\Seminars\\SecondLesson\\ReadTextForTheFirstTask.txt";
        try {
            List<String[]> list = readFromFile(s);
        replaseMark(list);
        writeToFile(s, list);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static List<String[]> readFromFile(String Path) throws IOException{
        FileReader fileReader = new FileReader(Path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String[]> list = new ArrayList<>();
        String line;
        while((line = bufferedReader.readLine()) != null){
            list.add(line.split("="));
        }
        return list;
    }
    public static void replaseMark(List<String[]> list){
        for (int i = 0; i < list.size(); i++) {
            if((!list.get(i)[1].equals("?") && !checkString(list.get(i)[1]))){
                throw new RuntimeException("Некорректные данные!");
            }
            if (list.get(i)[1].equals("?")){
                int buf = list.get(i)[0].length();
                String[] r = {list.get(i)[0], String.valueOf(buf)};
                list.set(i, r);
            }
        }
        
    }

    public static boolean checkString(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    public static void writeToFile(String path, List<String[]> list) throws IOException{
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String[] item : list){
            bufferedWriter.write(item[0] + "=" + item[1] + "\n");
        }
        bufferedWriter.close();
    }
}
