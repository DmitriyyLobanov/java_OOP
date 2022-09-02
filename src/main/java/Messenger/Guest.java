/**
 * Класс реализующий сущность "Гость".
 */
package Messenger;

public class Guest extends Person {

    /**
     * Конструктор - создание экземпляра с заданием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param ID id.
     */
    public Guest(String name, String surname, int ID) {
        super(name, surname, ID,Role.GUEST);

    }
}
