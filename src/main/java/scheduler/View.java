/**
 * Класс реализуйщий визуальное отображение информации в консоли.
 * TODO
 */
package scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    /**
     * Метод запуска модуля view
     */
    public  static  void startView(){
        System.out.println("Привет, выбери действие:\n"+
                "1 - посмотреть список имеющихся задач.\n"+
                "2 - добавить новую задачу.");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        if (userChoice == "1"){

        }
    }

}
