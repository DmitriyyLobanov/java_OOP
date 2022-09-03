/**
 * Класс реализующий сущность "Модератор".
 */
package Messenger;

public class Moderator extends Person {

    /**
     * Конструктор - создание экземпляра с заданием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param ID id.
     */
    public Moderator(String name, String surname, int ID) {
        super(name, surname, ID,Role.MODERATOR);
    }

    /**
     * Метод удаления сообщения по id сообщения.
     * @param ID id сообщения.
     */
    public void deleteMessage(int ID){
        Messenger messenger = getMessenger();
        messenger.deleteMessage(this, ID);
    }
}
