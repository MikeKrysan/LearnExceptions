package Exception_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception_12 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\user\\IdeaProjects\\LearnException\\src\\Exception_12");
//        try {
//            Scanner scanner = new Scanner(file);
//            System.out.println("После Scanner'a");
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не найден");
//        }
//        System.out.println("После try-catch");
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("Файл найден и отработан!");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\LearnException\\src\\Exception_12\\test_12");
        Scanner scanner = new Scanner(file);

    }
}
