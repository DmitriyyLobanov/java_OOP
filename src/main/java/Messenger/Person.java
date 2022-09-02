/**
 * Класс реализующий абстрактную сущность "Личность".
 */
package Messenger;

public abstract class Person {

        /**Поле имя*/
        private String name;

        /**Поле роль*/
        private Role role;

        /**Поле мессенджер*/
        private Messenger messenger;

    /**
     * Метод задания значения поля {@link Person#role}
     * @param role роль.
     */
    public void setRole(Role role) {
            this.role = role;
        }


    /**
     * Метод получения значения поля {@link Person#messenger}
     * @return мессенджер.
     */
    public Messenger getMessenger() {
            return messenger;
        }

    /**
     * Метод получения значения поля {@link Person#name}
     * @return имя.
     */
    public String getName() {
            return name;
        }

    /**
     * Метод получения значения поля {@link Person#role}
     * @return роль.
     */
    public Role getRole() {
            return role;
        }

    /**
     * Метод задания значения поля {@link Person#name}
     * @param name имя.
     */
    public void setName(String name) {
            this.name = name;
        }

    /**
     * Конструктор - созание экземпляра с заданием параметров.
     * @param name имя.
     * @param surname фамилия.
     * @param ID id.
     * @param role роль.
     */
        public Person(String name, String surname, int ID, Role role) {
            this.role = role;
            this.name = name;

        }

    /**
     * Метод задания значения поля {@link Person#messenger}
     * @param messenger мессенджер.
     */
    public void setMessenger(Messenger messenger){
            this.messenger = messenger;

        }

    /**
     * Метод позволяющий отправить сообщение другому пользователю.
     * @param receiver получатель.
     * @param text текст сообщения.
     */
    public void sendMessage(Person receiver, String text){
            messenger.sendMessage(this,receiver,text);
        }

    }




