/**
 * Класс реализующий сущность "Пользователь".
 */
package Messenger;

public class User extends Person {

    /**
     * Конструктор - создание экземпляра с заданием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param ID id.
     */
    public User(String name, String surname, int ID) {
        super(name, surname, ID, Role.USER);
    }
}
