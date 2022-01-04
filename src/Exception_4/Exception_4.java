package Exception_4;

import java.io.IOException;
import java.text.ParseException;

public class Exception_4 {
    public static void main(String[] args) {
        try {
            run();
//        } catch (IOException | ParseException e ) { //java 7. Теперь для двух видов исключений у нас будет одинаковая обработка (multicatch)
//            e.printStackTrace();
//        }  catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        } catch(Exception e) {
            System.out.println("Исключение перехвачено главным классом. Далее программа выходит из блока catch");
        }
    }

    public static void run() throws IOException, ParseException, IllegalAccessException {

    }
}
