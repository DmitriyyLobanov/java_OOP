package Messenger;

public class Application {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        User user1 = new User("Dima", "L", 01);
        User user2 = new User("Dima", "V", 02);
        messenger.registrationUser(user1);
        messenger.registrationUser(user2);
        user1.sendMessage(user2, "Беда со свободныйм временем, для выполнения данной практической" +
                "пришлось прибегнуть к помощи товарища.");
        user2.sendMessage(user1, "Стыд и позор Дмитрий, где Ваша самодисциплина?!!!");
        System.out.println(messenger.messageList);

        Moderator user3 = new Moderator("Vasiliy", "Popov", 3);
        Admin user4 = new Admin("Slava", "Korolev", 4);
        messenger.registrationUser(user3);
        messenger.registrationUser(user4);

        messenger.renameMassage(user4,2,"RENAME text");
        System.out.println(messenger.messageList);
        messenger.deleteMessage(user3, 1);
        System.out.println(messenger.messageList);

    }
}
