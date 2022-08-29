package Messenger;

public class Moderator extends Person {

    public Moderator(String name, String surname, int ID) {
        super(name, surname, ID,Role.MODERATOR);
    }
    public void deleteMessage(int ID){
        Messenger messenger = getMessenger();
        messenger.deleteMessage(this, ID);
    }
}
