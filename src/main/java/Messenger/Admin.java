package Messenger;

public class Admin extends Moderator{

    public Admin(String name, String surname, int ID) {
        super(name, surname, ID);
        setRole(Role.ADMIN);
    }
    public void renameMessage(int ID,String text){
        Messenger messenger = getMessenger();
        messenger.changeMassage(this, ID, text);
    }
}
