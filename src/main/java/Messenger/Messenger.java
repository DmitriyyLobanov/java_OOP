/**
 * Класс реализующий хранение и обработку данных.
 */
package Messenger;

import Messenger.Interfaces.BaseMessenger;
import Messenger.Interfaces.Utiliter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Messenger implements BaseMessenger, Utiliter {

    /**Поле логгер*/
    static Logger LOGGER = Logger.getLogger(Messenger.class.getSimpleName());

    /**Поле список сообщений*/
    protected List<Message> messageList;

    /**Поле список пользователей*/
    protected List<Person> usersList;

    /**Поле счетчик сообщений*/
    int messageCounter;

    /**
     * Конструктор - создание экземпляра без задания параметров.
     */
    public Messenger() {
        this.messageList = new ArrayList<>();
        this.usersList = new ArrayList<>();
    }

    /**
     * Метод отправки сообщения.
     * @param sender отправитель.
     * @param receiver получатель.
     * @param text текст.
     */
    public void sendMessage(Person sender, Person receiver, String text) {
        LOGGER.info("User %s sent message to user %s , with text %s".formatted(sender.getName(), receiver.getName(), text));
        messageCounter++;
        Message message = new Message();
        message.setID(messageCounter);
        message.setSender(sender);
        message.setReceiver(receiver);
        message.setText(text);
        messageList.add(message);
    }

    /**
     * Метод регистрации пользователя.
     * @param person личность.
     */
    public void registrationUser(Person person){
        usersList.add(person);
        person.setMessenger(this);
    }

    /**
     * Метод удаления сообщения по пользователю и id сообщения.
     * @param person пользователь.
     * @param ID id сообщения.
     */
    public void deleteMessage(Person person, int ID){
        if (person.getRole() == Role.ADMIN || person.getRole() == Role.MODERATOR){
            messageList.removeIf(message -> message.getID() == ID);
        }

    }

    /**
     * Метод изменения сообщения.
     * @param person пользователь.
     * @param ID id сообщения.
     * @param text новый текст сообщения.
     */
    public void changeMassage(Person person, int ID, String text){
        if(person.getRole() == Role.ADMIN){
            for(Message msg : messageList){
                if(msg.getID() == ID){
                    msg.setText(text);
                }
            }
        }

    }
}
