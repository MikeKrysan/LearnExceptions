package Exception_22;

import Exception_2.ScannerException;

import java.io.IOException;
import java.util.Scanner;

public class Exception_22 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
           int x =  Integer.parseInt(scanner.nextLine());
           if(x != 0) {
//               try {
//                   throw new IOException();
//               } catch (IOException e) {
//                   System.out.println("Пользователь ввел что-то отличное от нуля");
//               }
               throw new ScannerException("Пользователь ввел что-то отличное от нуля");
           }
        }

    }
}
