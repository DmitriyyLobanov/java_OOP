/**
 * Класс реализующий сущность "Сообщение".
 */
package Messenger;

public class Message {

    /**Поле id*/
    private int ID;

    /**Поле текст*/
    private String text;

    /**Поле отправитель*/
    private Person sender;

    /**Поле получатель*/
    private Person receiver;

    /**
     * Метод получения строкового значения экземпляра.
     * @return
     */
    @Override
    public String toString() {
        return "Message{" +
                "ID=" + ID +
                ", text='" + text + '\'' +
                ", sender=" + sender.getName() +
                ", receiver=" + receiver.getName() +
                '}';
    }

    /**
     * Метод получения значения поля {@link Message#sender}
     * @return отправитель.
     */
    public Person getSender() {
        return sender;
    }

    /**
     * Метод задания значения поля {@link Message#sender}
     * @param sender отправитель
     */
    public void setSender(Person sender) {
        this.sender = sender;
    }

    /**
     * Метод получения значения поля {@link Message#receiver}
     * @return получатель
     */
    public Person getReceiver() {
        return receiver;
    }

    /**
     * Метод задания значения поля {@link Message#receiver}
     * @param receiver получатель
     */
    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    /**
     * Метод получения значения поля {@link Message#ID}
     * @return id сообщения
     */
    public int getID() {
        return ID;
    }

    /**
     * Метод задания значения поля {@link Message#ID}
     * @param ID id сообщения
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Метод получения значения поля {@link Message#text}
     * @return текст сообщения
     */
    public String getText() {
        return text;
    }

    /**
     * Метод задания значения поля {@link Message#text}
     * @param text текст сообщения
     */
    public void setText(String text) {
        this.text = text;
    }
}
