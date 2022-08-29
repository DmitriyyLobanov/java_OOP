package Messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Messenger {
    static Logger LOGGER = Logger.getLogger(Messenger.class.getSimpleName());
    List<Message> messageList;

    List<Person> usersList;
    int messageCounter;

    public Messenger() {
        this.messageList = new ArrayList<>();
        this.usersList = new ArrayList<>();
    }

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

    public void registrationUser(Person person){
        usersList.add(person);
        person.setMessenger(this);
    }


    public void deleteMessage(Person person, int ID){
        if (person.getRole() == Role.ADMIN || person.getRole() == Role.MODERATOR){
            messageList.removeIf(message -> message.getID() == ID);
        }

    }
    public void renameMassage(Person person, int ID, String text){
        if(person.getRole() == Role.ADMIN){
            for(Message msg : messageList){
                if(msg.getID() == ID){
                    msg.setText(text);
                }
            }
        }

    }
}
