package Seminar_1;

public class Man extends Person {
    private String name;
    private  String surname;

    private final Gender gender = Gender.MALE;


    public Man(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
