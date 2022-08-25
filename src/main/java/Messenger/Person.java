package Messenger;

public abstract class Person {

        private String name;
        private Role role;
        private Messenger messenger;


        public void setRole(Role role) {
            this.role = role;
        }

        public Messenger getMessenger() {
            return messenger;
        }

        public String getName() {
            return name;
        }

        public Role getRole() {
            return role;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Person(String name, String surname, int ID, Role role) {
            this.role = role;
            this.name = name;

        }
        public void setMessenger(Messenger messenger){
            this.messenger = messenger;

        }
        public void sendMessage(Person receiver, String text){
            messenger.sendMessage(this,receiver,text);
        }

    }




