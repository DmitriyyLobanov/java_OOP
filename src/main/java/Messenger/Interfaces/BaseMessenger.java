package Messenger.Interfaces;

import Messenger.Person;

public interface BaseMessenger {

    void sendMessage(Person sender, Person receiver, String text);

    void deleteMessage(Person person, int ID);

    void changeMassage(Person person, int ID, String text);

}
