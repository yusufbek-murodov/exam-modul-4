package tasks.task2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        reader();
    }

    private static void reader() {
        try {
            InputStream inputStream = new FileInputStream("/home/yusufbek/IdeaProjects/modul_4/projects/exam/src/tasks/task2/io/file.txt");
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int result = a + b;
                writer(result);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void writer(int result) {
        try {
            FileWriter fileWriter = new FileWriter("/home/yusufbek/IdeaProjects/modul_4/projects/exam/src/tasks/task2/io/result.txt");
            fileWriter.write("" + result);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
