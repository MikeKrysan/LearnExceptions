package Exception_2;

import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x!= 0) {
//                try {
//                    throw new IOException();
//                } catch (IOException e) {
//                    System.out.println("Пользователь ввел что-то кроме нуля");
//                }
                throw new ScannerException("Вы ввели что-то отличное от нуля");
            }
        }
    }
}
