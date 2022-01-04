package Exceptions_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions_1 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\user\\IdeaProjects\\LearnException\\src\\Exceptions_1\\test");
//        try {
//            Scanner scanner = new Scanner(file);
//            System.out.println("После Scanner'a");
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//        System.out.println("После блока try-catch");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\LearnException\\src\\Exceptions_1");
        Scanner scanner = new Scanner(file);
    }
}
