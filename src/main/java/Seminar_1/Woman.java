package Seminar_1;

public class Woman extends Person {
    private String name;
    private  String surname;

    private final Gender gender = Gender.FEMALE;

    public Woman(String name, String surname) {
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
