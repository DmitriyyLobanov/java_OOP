package Messenger;

public class Message {
    private int ID;
    private String text;
    private Person sender;
    private Person receiver;

    @Override
    public String toString() {
        return "Message{" +
                "ID=" + ID +
                ", text='" + text + '\'' +
                ", sender=" + sender.getName() +
                ", receiver=" + receiver.getName() +
                '}';
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
