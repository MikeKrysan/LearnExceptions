package Exception_3;

public class Exception_3 {
    public static void main(String[] args) {
        //checked exception (Compile time exception) - исключительные случаи в работе программы
        //unchecked exception (RunTimeException) - ошибки в работе программы.

        //Arithmetic exception
        //int a = 1/0;

        //NullPointerException
//        String name = null;
//        name.length();

        //ArrayIndexOutOfBoundsException
        int[] arr = new int[2];
        try {
            System.out.println(arr[2]);
        } catch (RuntimeException/*ArrayIndexOutOfBoundsException*/ e) {
            System.out.println("Такого элемента нет в массиве. Вы вышли за граници массива"); //Ошибки в программе также можно обрабатывать, но их нужно удалять из программы. RunTimeException нужно не обрабатывать, а исключать из программы
        }
    }
}
