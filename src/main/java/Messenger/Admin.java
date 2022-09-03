/**
 * Класс реализующий сущность "Администратор".
 */
package Messenger;

public class Admin extends Moderator{

    /**
     * Конструктор - создание экземпляра с заданием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param ID id.
     */
    public Admin(String name, String surname, int ID) {
        super(name, surname, ID);
        setRole(Role.ADMIN);
    }

    /**
     * Метод позволяющий изменить текст сообщения.
     * @param ID id сообщения.
     * @param text новый текст сообщения.
     */
    public void renameMessage(int ID,String text){
        Messenger messenger = getMessenger();
        messenger.changeMassage(this, ID, text);
    }
}
