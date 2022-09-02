/**
 * Интерфейс реализующий базовый функционал мессенджера.
 */
package Messenger.Interfaces;

import Messenger.Person;

public interface BaseMessenger {

    /**
     * Метод отправки сообщения.
     * @param sender отправитель.
     * @param receiver получатель.
     * @param text текст.
     */
    void sendMessage(Person sender, Person receiver, String text);

    /**
     * Метод удаления сообщения по пользователю и id сообщения.
     * @param person пользователь.
     * @param ID id сообщения.
     */
    void deleteMessage(Person person, int ID);

    /**
     * Метод изменения сообщения.
     * @param person пользователь.
     * @param ID id сообщения.
     * @param text новый текст сообщения.
     */
    void changeMassage(Person person, int ID, String text);

}
