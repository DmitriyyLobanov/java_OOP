package Messenger;

public class User extends Person {
    public User(String name, String surname, int ID) {
        super(name, surname, ID, Role.USER);
    }
}
